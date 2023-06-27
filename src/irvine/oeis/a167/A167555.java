package irvine.oeis.a167;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A167555 The third left hand column of triangle A167552.
 * @author Sean A. Irvine
 */
public class A167555 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167555() {
    super(3, new long[] {-1, 6, -15, 20, -15, 6}, new long[] {2, 14, 63, 209, 559, 1281});
  }
}
