package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090394 Ninth diagonal <code>(m=8)</code> of triangle <code>A084938; a(n) = A084938(n+8,n) = (n^8 + 84*n^7 + 3346*n^6 + 84840*n^5 + 1550689*n^4 + 21632436*n^3 + 224782284*n^2 + 1377648720*n)/40320</code>.
 * @author Sean A. Irvine
 */
public class A090394 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090394() {
    super(new long[] {1, -9, 36, -84, 126, -126, 84, -36, 9}, new long[] {0, 40320, 95616, 170856, 272584, 409360, 592296, 835702, 1157857});
  }
}
