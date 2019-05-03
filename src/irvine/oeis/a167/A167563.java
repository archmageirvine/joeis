package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167563 The sixth row of the <code>ED2</code> array <code>A167560</code>.
 * @author Sean A. Irvine
 */
public class A167563 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167563() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {720, 3360, 10752, 27648, 61440, 122880});
  }
}
