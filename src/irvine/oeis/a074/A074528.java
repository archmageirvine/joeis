package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074528 <code>a(n) = 2^n + 3^n + 6^n</code>.
 * @author Sean A. Irvine
 */
public class A074528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074528() {
    super(new long[] {36, -36, 11}, new long[] {3, 11, 49});
  }
}
