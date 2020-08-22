package irvine.oeis.a072;

import irvine.oeis.LinearRecurrence;

/**
 * A072345 Volume of n-dimensional sphere of radius r is V_n*r^n = Pi^(n/2)*r^n/(n/2)! = C_n*Pi^floor(n/2)*r^n; sequence gives numerator of C_n.
 * @author Sean A. Irvine
 */
public class A072345 extends LinearRecurrence {

  /** Construct the sequence. */
  public A072345() {
    super(new long[] {-2, 0, 3, 0}, new long[] {1, 2, 1, 4});
  }
}
