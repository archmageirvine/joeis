package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195622 Denominators <code>a(n)</code> of Pythagorean approximations <code>b(n)/a(n)</code> to 5.
 * @author Sean A. Irvine
 */
public class A195622 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195622() {
    super(new long[] {-1, 101, 101}, new long[] {20, 2020, 206040});
  }
}
