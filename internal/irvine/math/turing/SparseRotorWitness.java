package irvine.math.turing;

import java.util.List;

import irvine.math.turing.AffineTape.Block;
import irvine.math.turing.AffineTape.Length;
import irvine.math.turing.AffineTape.Rule;

import static irvine.math.turing.AffineTape.ONE;
import static irvine.math.turing.AffineTape.ZERO;
import static irvine.math.turing.AffineTape.require;

/**
 * Checks the local tape rewrites for five sparse-table nonhalting proofs.
 * @author Gregory Morse
 */
public final class SparseRotorWitness {

  private static final String SINGLE = "1RB---2RB_2LC2RB1LB_---1RA0LC";
  private static final String[] DOUBLES = {
    "1RB1RA0LA_2RC2RB1LB_2LA------",
    "1RB------_2RC2RB1LB_2LC1RA0LC",
    "1RB------_2RC2RB1LB_2LD------_---1RA0LD"
  };
  private static final String PAIRED = "1RB2RA1LA_2LA0RC---_---2RB2LB";
  private static final Block EDGE = new Block("#", ONE);

  private SparseRotorWitness() {
  }

  private static Length constant(final int n) {
    return new Length(0, n);
  }

  private static AffineTape position(final Rule[][] table, final int state, final List<Block> left, final List<Block> right) {
    final AffineTape t = new AffineTape(table, state, '0', left, right);
    t.mHead = AffineTape.unpack(t.mRight);
    return t;
  }

  private static void agrees(final AffineTape a, final AffineTape b, final Length n) {
    a.run(n, (t, s) -> false);
    require(a.agrees(b), "Sparse rotor rewrite failed");
  }

  // At state B, the portion left of the head is 1^a 2^b, and the
  // right half (including the head) contains c copies of 2 and only
  // zeros otherwise. Startup gives a=c+1. Each checked rewrite
  // changes a and c equally, so the left marker cannot run out.
  private static void verify(final String word, final boolean single) {
    final Rule[][] table = AffineTape.rules(word);
    final Block marker = new Block("1", ONE);
    agrees(position(table, 0, List.of(), List.of()), position(table, 1, List.of(marker), List.of()), ONE);
    for (final Length b : new Length[] {ZERO, ONE, new Length(1, 2)}) {
      final Block tail = new Block("2", b);
      final List<Block> left = List.of(tail, marker, EDGE);
      agrees(position(table, 1, left, List.of(new Block("2", ONE), EDGE)),
        position(table, 1, List.of(new Block("2", b.add(2)), EDGE), List.of(EDGE)), b.times(2).add(3));
      final Block blank = new Block("0", constant(single ? 1 : 2));
      final AffineTape before = position(table, 1, left, List.of(blank, EDGE));
      final AffineTape after;
      if (single && b.equals(ZERO)) {
        after = position(table, 1, List.of(new Block("2", ONE), marker, EDGE), List.of(EDGE));
      } else {
        final Length blanks = single ? b.add(-1) : b;
        after = position(table, 1, List.of(new Block("1", constant(2)), EDGE),
          List.of(new Block("0", blanks), new Block("2", ONE), EDGE));
      }
      agrees(before, after, b.add(single ? 3 : 5));
    }
    // For a double write, b and every finite zero run on the right
    // are even. Removing two zeros and inserting b preserves parity.
    // Thus every use of a two-zero rewrite is within its domain.
    System.out.println(word + " proved nonhalting");
  }

  private static void block(final Rule[][] t, final int initial, final String read, final int steps,
                            final int exit, final String written, final boolean leftward) {
    final AffineTape before = position(t, initial, List.of(EDGE), List.of(new Block(read, ONE), EDGE));
    final AffineTape after = leftward
      ? position(t, exit, List.of(), List.of(EDGE, new Block(written, ONE), EDGE))
      : position(t, exit, List.of(new Block(new StringBuilder(written).reverse().toString(), ONE), EDGE), List.of(EDGE));
    agrees(before, after, constant(steps));
  }

  // At an A-on-zero boundary either the left is empty and the right
  // is 1^(2k), or the left is a word in {1,02} starting with 1 and
  // the right is 1^(2k+1) 2^s, where s counts left-side 1s. The B
  // sweep changes each 11 into 02. The A sweep moves one 2 across
  // each terminal left-side 1 and preserves the two alternatives.
  private static void paired() {
    final Rule[][] t = AffineTape.rules(PAIRED);
    block(t, 0, "0", 1, 1, "1", false);
    block(t, 1, "11", 2, 1, "02", false);
    block(t, 1, "0", 1, 0, "2", true);
    block(t, 1, "12", 3, 0, "22", true);
    block(t, 0, "2", 1, 0, "1", true);
    for (final Length d : new Length[] {ONE, new Length(1, 2)}) {
      agrees(position(t, 0, List.of(EDGE), List.of(new Block("1", d), new Block("2", ONE), EDGE)),
        position(t, 0, List.of(), List.of(EDGE, new Block("1", d.add(1)), EDGE)), d.times(2).add(1));
    }
    System.out.println(PAIRED + " proved nonhalting");
  }

  /**
   * Run the exact symbolic checks for all five machines.
   * @param args ignored
   */
  public static void main(final String[] args) {
    verify(SINGLE, true);
    for (final String word : DOUBLES) {
      verify(word, false);
    }
    paired();
  }
}
