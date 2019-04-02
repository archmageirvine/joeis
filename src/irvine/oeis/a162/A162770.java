package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162770 a(n) = ((2+sqrt(5))*(1+sqrt(5))^n + (2-sqrt(5))*(1-sqrt(5))^n)/2.
 * @author Sean A. Irvine
 */
public class A162770 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162770() {
    super(new long[] {4, 2}, new long[] {2, 7});
  }
}
