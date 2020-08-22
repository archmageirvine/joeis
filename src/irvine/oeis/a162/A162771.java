package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162771 a(n) = ((2+sqrt(5))*(3+sqrt(5))^n + (2-sqrt(5))*(3-sqrt(5))^n)/2.
 * @author Sean A. Irvine
 */
public class A162771 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162771() {
    super(new long[] {-4, 6}, new long[] {2, 11});
  }
}
