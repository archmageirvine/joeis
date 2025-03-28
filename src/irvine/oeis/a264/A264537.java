package irvine.oeis.a264;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A264537 Number of (4+1) X (n+1) arrays of permutations of 0..n*5+4 with each element having directed index change -2,-2 -1,0 0,1 or 1,0.
 * @author Georg Fischer
 */
public class A264537 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A264537() {
    super(1, "[0,0,19,-17,46,-16,64,-8,-104,256,-256,768]", "[1,-3,0,-18,0,-120,24,-288,0,0,-256]");
  }
}
