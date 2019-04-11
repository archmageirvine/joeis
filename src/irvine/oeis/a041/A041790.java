package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041790 Numerators of continued fraction convergents to <code>sqrt(416)</code>.
 * @author Sean A. Irvine
 */
public class A041790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041790() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 10402, 0, 0, 0, 0, 0, 0, 0}, new long[] {20, 41, 61, 102, 979, 1081, 2060, 5201, 210100, 425401, 635501, 1060902, 10183619, 11244521, 21428140, 54100801});
  }
}
