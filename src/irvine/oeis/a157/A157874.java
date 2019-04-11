package irvine.oeis.a157;

import irvine.oeis.LinearRecurrence;

/**
 * A157874 Expansion of <code>104*x^2 / (-x^3+675*x^2-675*x+1)</code>.
 * @author Sean A. Irvine
 */
public class A157874 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157874() {
    super(new long[] {1, -675, 675}, new long[] {0, 104, 70200});
  }
}
