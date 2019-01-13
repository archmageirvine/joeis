package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022452.
 * @author Sean A. Irvine
 */
public class A022452 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022452() {
    super(new long[] {-280, 411, -151, 21}, new long[] {1, 21, 290, 3330});
  }
}
