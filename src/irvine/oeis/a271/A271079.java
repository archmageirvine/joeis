package irvine.oeis.a271;

import irvine.oeis.LinearRecurrence;

/**
 * A271079 Residues <code>(mod 32)</code> of partial sums of Fibonacci numbers starting with <code>F(2)</code>.
 * @author Sean A. Irvine
 */
public class A271079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271079() {
    super(new long[] {1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0, -1, 0, 1, 0}, new long[] {1, 3, 6, 11, 19, 0, 21, 23, 14, 7, 23, 0, 25, 27, 22, 19, 11, 0, 13, 15, 30, 15, 15, 0, 17, 19, 6, 27, 3, 0, 5, 7, 14, 23, 7, 0, 9, 11, 22, 3, 27, 0, 29, 31, 30, 31});
  }
}
