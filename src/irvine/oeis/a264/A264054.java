package irvine.oeis.a264;
// Generated by gen_seq4.pl 2024-12-27.ack/lingfcj at 2024-12-27 23:20

import irvine.oeis.Conjectural;
import irvine.oeis.recur.GeneratingFunctionSequence;

/**
 * A264054 Number of (n+1) X (2+1) arrays of permutations of 0..n*3+2 with each element having index change +-(.,.) 0,0 1,2 or 2,-2.
 * @author Georg Fischer
 */
public class A264054 extends GeneratingFunctionSequence implements Conjectural {

  /** Construct the sequence. */
  public A264054() {
    super(1, "[0,2,2,-4,-7,2,2,2,-1]", "[1,-3,1,-3,9,-3,1,-3,1]");
  }
}
