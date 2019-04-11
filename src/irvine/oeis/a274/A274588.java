package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274588 Values of n such that <code>2*n-1</code> and <code>7*n-1</code> are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A274588 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274588() {
    super(new long[] {1, -1, -898, 898, 1}, new long[] {1, 8, 638, 6931, 572671});
  }
}
