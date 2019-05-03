package irvine.oeis.a235;

import irvine.oeis.LinearRecurrence;

/**
 * A235996 Number of length n binary words that contain at least one pair of consecutive <code>0</code>'s followed by (at some point in the word) at least one pair of consecutive <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A235996 extends LinearRecurrence {

  /** Construct the sequence. */
  public A235996() {
    super(new long[] {2, 3, -4, -3, 4}, new long[] {0, 0, 0, 0, 1});
  }
}
