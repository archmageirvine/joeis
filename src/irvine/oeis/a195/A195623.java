package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195623 Numerators <code>b(n)</code> of Pythagorean approximations <code>b(n)/a(n)</code> to 5.
 * @author Sean A. Irvine
 */
public class A195623 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195623() {
    super(new long[] {-1, 101, 101}, new long[] {99, 10101, 1030199});
  }
}
