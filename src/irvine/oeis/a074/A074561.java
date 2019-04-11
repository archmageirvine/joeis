package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074561 <code>a(n) = 4^n + 5^n + 6^n</code>.
 * @author Sean A. Irvine
 */
public class A074561 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074561() {
    super(new long[] {120, -74, 15}, new long[] {3, 15, 77});
  }
}
