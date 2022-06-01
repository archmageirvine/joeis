package irvine.oeis.a027;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A027944 a(n) = T(2n+1, n+4), T given by A027935.
 * @author Sean A. Irvine
 */
public class A027944 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027944() {
    super(new long[] {1, -10, 43, -105, 161, -161, 105, -43, 10}, new long[] {1, 37, 376, 2267, 10220, 38403, 127921, 392688, 1140260});
  }
}
