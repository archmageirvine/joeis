package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167567 The fourth left hand column of triangle A167565.
 * @author Sean A. Irvine
 */
public class A167567 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167567() {
    super(new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {0, 14, 124, 601, 2120, 6096, 15168, 33858});
  }
}
