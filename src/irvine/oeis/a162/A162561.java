package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162561 <code>a(n) =</code> ((4+sqrt(3))*(5+sqrt(3))^nv+v(4-sqrt(3))*(5-sqrt(3))^n)/2.
 * @author Sean A. Irvine
 */
public class A162561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162561() {
    super(new long[] {-22, 10}, new long[] {4, 23});
  }
}
