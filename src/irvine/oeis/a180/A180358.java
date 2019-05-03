package irvine.oeis.a180;

import irvine.oeis.LinearRecurrence;

/**
 * A180358 <code>n^8+8n</code>.
 * @author Sean A. Irvine
 */
public class A180358 extends LinearRecurrence {

  /** Construct the sequence. */
  public A180358() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 9, 272, 6585, 65568, 390665, 1679664, 5764857, 16777280});
  }
}
