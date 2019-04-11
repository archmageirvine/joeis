package irvine.oeis.a274;

import irvine.oeis.LinearRecurrence;

/**
 * A274680 Values of n such that <code>2*n+1</code> and <code>4*n+1</code> are both triangular numbers.
 * @author Sean A. Irvine
 */
public class A274680 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274680() {
    super(new long[] {1, -1, -1331714, 1331714, 1}, new long[] {0, 16065, 545751, 21394547226L, 726784809030L});
  }
}
