package irvine.oeis.a113;

import irvine.oeis.LinearRecurrence;

/**
 * A113630.
 * @author Sean A. Irvine
 */
public class A113630 extends LinearRecurrence {

  /** Construct the sequence. */
  public A113630() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {1, 45, 4097, 83653, 757305, 4272461, 17736745, 59409477, 169826513});
  }
}
