package irvine.oeis.a282;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A282513 a(n) = floor((3*n + 2)^2/24 + 1/3).
 * @author Sean A. Irvine
 */
public class A282513 extends LinearRecurrence {

  /** Construct the sequence. */
  public A282513() {
    super(new long[] {1, -2, 1, 0, -1, 2}, new long[] {0, 1, 3, 5, 8, 12});
  }
}
