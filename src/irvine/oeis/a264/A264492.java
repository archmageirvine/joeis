package irvine.oeis.a264;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A264492 Number of (4+1) X (n+1) arrays of permutations of 0..n*5+4 with each element having directed index change 2,-1 1,0 2,1 0,-1 -2,-2 or -1,0.
 * @author Georg Fischer
 */
public class A264492 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A264492() {
    super(1, "[0,12,4,4,32,16,-32]", "[1,-1,-16,-24,-16,-32,-32]");
  }
}
