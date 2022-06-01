package irvine.oeis.a074;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A074528 a(n) = 2^n + 3^n + 6^n.
 * @author Sean A. Irvine
 */
public class A074528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074528() {
    super(new long[] {36, -36, 11}, new long[] {3, 11, 49});
  }
}
