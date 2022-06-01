package irvine.oeis.a163;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A163615 a(n) = ((1 + 3*sqrt(2))*(4 + sqrt(2))^n + (1 - 3*sqrt(2))*(4 - sqrt(2))^n)/2.
 * @author Sean A. Irvine
 */
public class A163615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163615() {
    super(new long[] {-14, 8}, new long[] {1, 10});
  }
}
