package irvine.oeis.a083;

import irvine.oeis.LinearRecurrence;

/**
 * A083105 Second-order linear recurrence sequence with <code>a(n) = a(n-1) + a(n-2)</code>.
 * @author Sean A. Irvine
 */
public class A083105 extends LinearRecurrence {

  /** Construct the sequence. */
  public A083105() {
    super(new long[] {1, 1}, new long[] {62638280004239857L, 49463435743205655L});
  }
}
