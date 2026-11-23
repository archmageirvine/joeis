package irvine.math.turing;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import irvine.math.turing.AffineTape.Block;
import irvine.math.turing.AffineTape.Length;

import static irvine.math.turing.AffineTape.ONE;
import static irvine.math.turing.AffineTape.ZERO;
import static irvine.math.turing.AffineTape.require;

/**
 * Verifies Ligocki's six-state witness and the lower bound used by A362199.
 * @author Gregory Morse
 */
public final class E78kWitness {

  private static final int E = 'E' - 'A';
  private static final String MACHINE = "1RB1RC_1LC0RF_1RA0LD_0LC0LE_1LD0RA_1RE1RZ";
  private static final AffineTape.Rule[][] TABLE = AffineTape.rules(MACHINE);
  private static final Block EDGE = new Block("#", ONE);

  private E78kWitness() {
  }

  private static Length len(final int n) {
    return new Length(0, n);
  }

  private static AffineTape c(final Length a, final Length b, final Length z, final Length d, final boolean sentinel) {
    final List<Block> right = new ArrayList<>(List.of(new Block("01", a.times(2)), new Block("1", b),
      new Block("0", z), new Block("1", d)));
    if (sentinel) {
      right.add(EDGE);
    }
    return new AffineTape(TABLE, E, '1', List.of(), right);
  }

  private static boolean grow(final AffineTape tape, final Length goal) {
    if (tape.mState != E || tape.mHead != '1' || tape.mLeft.isEmpty()) {
      return false;
    }
    final Block b = tape.mLeft.get(0);
    final boolean rotate = "0".equals(b.mWord) && ONE.equals(b.mCount)
      && tape.mLeft.size() >= 2 && "10".equals(tape.mLeft.get(1).mWord);
    final Length n = rotate ? tape.mLeft.get(1).mCount : b.mCount;
    if (!rotate && !"01".equals(b.mWord) || n.mOffset < 1) {
      return false;
    }
    final Length after = tape.mSteps.add(n.times(10));
    if (!goal.atLeast(after)) {
      return false;
    }
    final List<Block> rest = new ArrayList<>(tape.mRight);
    try {
      if (AffineTape.unpack(rest) != '0' || AffineTape.unpack(rest) != '0') {
        return false;
      }
    } catch (final IllegalStateException e) {
      return false;
    }
    tape.mLeft.subList(0, rotate ? 2 : 1).clear();
    if (rotate) {
      AffineTape.push(tape.mLeft, "0", ONE);
    }
    tape.mRight.clear();
    tape.mRight.addAll(rest);
    AffineTape.push(tape.mRight, "1", n.times(2));
    AffineTape.push(tape.mRight, "00", ONE);
    tape.mSteps = after;
    return true;
  }

  private static void verify(final String tag, final AffineTape source, final AffineTape target, final Length time) {
    source.run(time, E78kWitness::grow);
    require(source.agrees(target), "Invalid macro " + tag);
  }

  private static final class Triples {
    private final BigInteger mA;
    private final BigInteger mTime;
    private final int mRemainder;

    private Triples(final BigInteger a, final BigInteger z) {
      final BigInteger[] qr = z.divideAndRemainder(BigInteger.valueOf(3));
      final int count = qr[0].intValueExact();
      final BigInteger p = a.add(BigInteger.TWO);
      final BigInteger twice = BigInteger.ONE.shiftLeft(count);
      // The recurrence is a -> 2*a+2, costing 32*a*a+100*a+57.
      // Write a_i=(a+2)*2^i-2 and sum the two geometric series.
      mTime = p.multiply(p).shiftLeft(5).multiply(twice.multiply(twice).subtract(BigInteger.ONE).divide(BigInteger.valueOf(3)))
        .subtract(p.multiply(twice.subtract(BigInteger.ONE)).multiply(BigInteger.valueOf(28)))
        .subtract(BigInteger.valueOf(15L * count));
      mA = p.multiply(twice).subtract(BigInteger.TWO);
      mRemainder = qr[1].intValueExact();
    }
  }

  /**
   * Verify local rules, then compose them to compute a halting runtime.
   * @return the number of steps to halt on a blank tape
   */
  public static BigInteger runtime() {
    final AffineTape start = new AffineTape(TABLE, E, '1', List.of(new Block("01", ONE), EDGE), List.of(new Block("00", ONE), EDGE));
    start.run(len(10), (a, goal) -> false);
    require(start.agrees(new AffineTape(TABLE, E, '1', List.of(EDGE), List.of(new Block("0011", ONE), EDGE))), "Invalid local growth");
    verify("blank", new AffineTape(TABLE, 0, '0', List.of(), List.of()), c(ONE, ONE, len(8), ONE, false), len(85));
    for (final Length a : new Length[] {ZERO, ONE, len(2), len(3), new Length(1, 4)}) {
      verify("R1", c(a, len(2), ZERO, ZERO, true), c(a.add(1), ZERO, ZERO, ZERO, true), a.times(16).add(14));
      verify("R3", c(a, ONE, len(3), ZERO, true), c(ONE, a.times(4).add(3), ZERO, ZERO, true), a.times(24).add(27));
      verify("R5", c(a, ONE, len(2), ONE, false), c(ONE, ONE, a.times(4).add(6), ONE, false), a.times(8).add(40));
      verify("R6", c(a, ONE, ONE, ONE, false), c(ONE, ONE, a.times(4).add(4), len(3), false), a.times(24).add(54));
      final AffineTape halt = c(a, ONE, len(2), len(3), false);
      halt.run(a.times(4).add(6), E78kWitness::grow);
      require(halt.mState == AffineTape.HALT, "Witness does not halt");
    }
    Triples b = new Triples(BigInteger.ONE, BigInteger.valueOf(8));
    require(b.mRemainder == 2, "Wrong first zero remainder");
    BigInteger steps = BigInteger.valueOf(85 + 40).add(b.mTime).add(b.mA.shiftLeft(3));
    b = new Triples(BigInteger.ONE, b.mA.shiftLeft(2).add(BigInteger.valueOf(6)));
    require(b.mRemainder == 1, "Wrong second zero remainder");
    steps = steps.add(b.mTime).add(b.mA.multiply(BigInteger.valueOf(24))).add(BigInteger.valueOf(54));
    b = new Triples(BigInteger.ONE, b.mA.shiftLeft(2).add(BigInteger.valueOf(4)));
    require(b.mRemainder == 2, "Wrong final zero remainder");
    return steps.add(b.mTime).add(b.mA.shiftLeft(2)).add(BigInteger.valueOf(6));
  }

  /**
   * Check the witness and report the sharp decimal exponent of its runtime.
   * @param args ignored
   */
  public static void main(final String[] args) {
    final BigInteger runtime = runtime();
    require(runtime.compareTo(BigInteger.TEN.pow(42_000)) > 0, "Insufficient reciprocal tail bound");
    System.out.println("Checked six-state halt: runtime exceeds 10^" + (runtime.toString().length() - 1));
  }
}
