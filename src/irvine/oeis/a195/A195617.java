package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195617 Numerators <code>b(n)</code> of Pythagorean approximations <code>b(n)/a(n)</code> to 3.
 * @author Sean A. Irvine
 */
public class A195617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195617() {
    super(new long[] {-1, 37, 37}, new long[] {35, 1333, 50615});
  }
}
