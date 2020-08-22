package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167549 The sixth row of the ED1 array A167546.
 * @author Sean A. Irvine
 */
public class A167549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167549() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {120, 1440, 6720, 21504, 55296, 122880});
  }
}
