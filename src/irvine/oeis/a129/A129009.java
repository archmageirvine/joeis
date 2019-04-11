package irvine.oeis.a129;

import irvine.oeis.LinearRecurrence;

/**
 * A129009 <code>(n^3+n^2)*9^n</code>.
 * @author Sean A. Irvine
 */
public class A129009 extends LinearRecurrence {

  /** Construct the sequence. */
  public A129009() {
    super(new long[] {-6561, 2916, -486, 36}, new long[] {18, 972, 26244, 524880});
  }
}
