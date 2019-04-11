package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195614 Denominators <code>a(n)</code> of Pythagorean approximations <code>b(n)/a(n)</code> to 2.
 * @author Sean A. Irvine
 */
public class A195614 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195614() {
    super(new long[] {-1, 17, 17}, new long[] {8, 136, 2448});
  }
}
