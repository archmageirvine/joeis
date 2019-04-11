package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041765 Denominators of continued fraction convergents to <code>sqrt(403)</code>.
 * @author Sean A. Irvine
 */
public class A041765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041765() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1339756, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 13, 27, 40, 147, 187, 708, 895, 2498, 33369, 1337258, 17417723, 36172704, 53590427, 196943985, 250534412, 948547221, 1199081633, 3346710487L, 44706317964L});
  }
}
