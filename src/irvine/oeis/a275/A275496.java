package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275496 <code>a(n) = n^2*(2*n^2 + (-1)^n)</code>.
 * @author Sean A. Irvine
 */
public class A275496 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275496() {
    super(new long[] {1, -2, -2, 6, 0, -6, 2, 2}, new long[] {0, 1, 36, 153, 528, 1225, 2628, 4753});
  }
}
