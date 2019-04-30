package irvine.oeis.a251;

import irvine.oeis.LinearRecurrence;

/**
 * A251732 <code>a(n) =</code> 3^n*A123335(n). Rational parts of the integers in <code>Q(sqrt(2))</code> giving the length of a L&#233;vy C-curve variant at iteration step n.
 * @author Sean A. Irvine
 */
public class A251732 extends LinearRecurrence {

  /** Construct the sequence. */
  public A251732() {
    super(new long[] {9, -6}, new long[] {1, -3});
  }
}
