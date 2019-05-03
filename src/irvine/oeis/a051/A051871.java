package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051871 <code>19-gonal</code> (or enneadecagonal) numbers: <code>n(17n-15)/2</code>.
 * @author Sean A. Irvine
 */
public class A051871 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051871() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 19});
  }
}
