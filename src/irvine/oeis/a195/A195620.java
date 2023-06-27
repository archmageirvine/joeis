package irvine.oeis.a195;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A195620 Numerators of Pythagorean approximations to 4.
 * @author Sean A. Irvine
 */
public class A195620 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195620() {
    super(1, new long[] {-1, 65, 65}, new long[] {63, 4161, 274559});
  }
}
