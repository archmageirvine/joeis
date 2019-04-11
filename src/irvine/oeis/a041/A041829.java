package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041829 Denominators of continued fraction convergents to <code>sqrt(435)</code>.
 * @author Sean A. Irvine
 */
public class A041829 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041829() {
    super(new long[] {-1, 0, 0, 0, 292, 0, 0, 0}, new long[] {1, 1, 6, 7, 286, 293, 1751, 2044});
  }
}
