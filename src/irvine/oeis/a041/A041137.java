package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041137 Denominators of continued fraction convergents to <code>sqrt(77)</code>.
 * @author Sean A. Irvine
 */
public class A041137 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041137() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 702, 0, 0, 0, 0, 0}, new long[] {1, 1, 4, 9, 31, 40, 671, 711, 2804, 6319, 21761, 28080});
  }
}
