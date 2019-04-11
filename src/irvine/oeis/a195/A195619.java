package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195619 Denominators <code>a(n)</code> of Pythagorean approximations <code>b(n)/a(n)</code> to 4.
 * @author Sean A. Irvine
 */
public class A195619 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195619() {
    super(new long[] {-1, 65, 65}, new long[] {16, 1040, 68640});
  }
}
