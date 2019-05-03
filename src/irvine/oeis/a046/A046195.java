package irvine.oeis.a046;

import irvine.oeis.LinearRecurrence;

/**
 * A046195 Indices of heptagonal numbers <code>(A000566)</code> which are also squares <code>(A000290)</code>.
 * @author Sean A. Irvine
 */
public class A046195 extends LinearRecurrence {

  /** Construct the sequence. */
  public A046195() {
    super(new long[] {1, -1, 0, -1442, 1442, 0, 1}, new long[] {1, 6, 49, 961, 8214, 70225, 1385329});
  }
}
