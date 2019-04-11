package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195620 Numerators <code>b(n)</code> of Pythagorean approximations <code>b(n)/a(n)</code> to 4.
 * @author Sean A. Irvine
 */
public class A195620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195620() {
    super(new long[] {-1, 65, 65}, new long[] {63, 4161, 274559});
  }
}
