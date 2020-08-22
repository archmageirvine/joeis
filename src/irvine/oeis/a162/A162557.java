package irvine.oeis.a162;

import irvine.oeis.LinearRecurrence;

/**
 * A162557 a(n) = ((3+sqrt(3))*(4+sqrt(3))^n+(3-sqrt(3))*(4-sqrt(3))^n)/6.
 * @author Sean A. Irvine
 */
public class A162557 extends LinearRecurrence {

  /** Construct the sequence. */
  public A162557() {
    super(new long[] {-13, 8}, new long[] {1, 5});
  }
}
