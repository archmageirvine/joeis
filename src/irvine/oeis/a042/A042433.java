package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042433 Denominators of continued fraction convergents to <code>sqrt(744)</code>.
 * @author Sean A. Irvine
 */
public class A042433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042433() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 15002, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 3, 4, 7, 11, 18, 29, 47, 76, 275, 14926, 45053, 59979, 105032, 165011, 270043, 435054, 705097, 1140151, 4125550});
  }
}
