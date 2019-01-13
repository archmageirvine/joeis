package irvine.oeis.a036;

import irvine.oeis.LinearRecurrence;

/**
 * A036086.
 * @author Sean A. Irvine
 */
public class A036086 extends LinearRecurrence {

  /** Construct the sequence. */
  public A036086() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 257, 6817, 72097, 456161, 2070241, 7444417, 22542017, 59823937});
  }
}
