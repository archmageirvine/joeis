package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275830 <code>a(n) = (2*sqrt(7)*sin(Pi/7))^n + (-2*sqrt(7)*sin(2*Pi/7))^n + (-2*sqrt(7)*sin(4*Pi/7))^n</code>.
 * @author Sean A. Irvine
 */
public class A275830 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275830() {
    super(new long[] {49, 0, -7}, new long[] {3, -7, 49});
  }
}
