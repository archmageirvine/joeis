package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163615 <code>a(n) = ((1 + 3*sqrt(2))*(4 + sqrt(2))^n + (1 - 3*sqrt(2))*(4 - sqrt(2))^n)/2</code>.
 * @author Sean A. Irvine
 */
public class A163615 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163615() {
    super(new long[] {-14, 8}, new long[] {1, 10});
  }
}
