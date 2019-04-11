package irvine.oeis.a022;

import irvine.oeis.LinearRecurrence;

/**
 * A022523 Nexus numbers <code>(n+1)^7-n^7</code>.
 * @author Sean A. Irvine
 */
public class A022523 extends LinearRecurrence {

  /** Construct the sequence. */
  public A022523() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 127, 2059, 14197, 61741, 201811, 543607});
  }
}
