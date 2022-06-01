package irvine.oeis.a056;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A056565 Fibonomial coefficients.
 * @author Sean A. Irvine
 */
public class A056565 extends LinearRecurrence {

  /** Construct the sequence. */
  public A056565() {
    super(new long[] {-1, -21, 273, 1092, -1820, -1092, 273, 21}, new long[] {1, 21, 714, 19635, 582505, 16776144, 488605194, 14169550626L});
  }
}
