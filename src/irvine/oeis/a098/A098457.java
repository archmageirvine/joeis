package irvine.oeis.a098;

import irvine.oeis.LinearRecurrence;

/**
 * A098457 Farey Bisection Expansion of sqrt(7).
 * @author Sean A. Irvine
 */
public class A098457 extends LinearRecurrence {

  /** Construct the sequence. */
  public A098457() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 0, 1, 0, 1, 1});
  }
}
