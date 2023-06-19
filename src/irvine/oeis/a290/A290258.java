package irvine.oeis.a290;
// manually deris2/essent at 2021-11-04

import irvine.oeis.a277.A277335;

/**
 * A290258 Triangle read by rows: row n (&gt;=2) contains in increasing order the integers for which the binary representation has length n and all runs of 1's have even length.
 * Basically the same as A277335.
 * @author Georg Fischer
 */
public class A290258 extends A277335 {

  /** Construct the sequence. */
  public A290258() {
    skip(1);
  }
}
