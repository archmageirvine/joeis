package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055005.
 * @author Sean A. Irvine
 */
public class A055005 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055005() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 0, 0, 6, 63, 306, 1038, 2844, 6750});
  }
}
