package irvine.oeis.a208;

import irvine.oeis.LinearRecurrence;

/**
 * A208902.
 * @author Sean A. Irvine
 */
public class A208902 extends LinearRecurrence {

  /** Construct the sequence. */
  public A208902() {
    super(new long[] {-8, 16, -6, -6, 5}, new long[] {2, 6, 14, 34, 78});
  }
}
