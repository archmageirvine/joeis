package irvine.oeis.a064;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A064752 a(n) = n*6^n - 1.
 * @author Sean A. Irvine
 */
public class A064752 extends LinearRecurrence {

  /** Construct the sequence. */
  public A064752() {
    super(1, new long[] {36, -48, 13}, new long[] {5, 71, 647});
  }
}
