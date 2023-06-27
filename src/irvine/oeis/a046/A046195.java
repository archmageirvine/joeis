package irvine.oeis.a046;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A046195 Indices of heptagonal numbers (A000566) which are also squares (A000290).
 * @author Sean A. Irvine
 */
public class A046195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046195() {
    super(1, new long[] {1, -1, 0, -1442, 1442, 0, 1}, new long[] {1, 6, 49, 961, 8214, 70225, 1385329});
  }
}
