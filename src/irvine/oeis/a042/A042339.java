package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042339 Denominators of continued fraction convergents to <code>sqrt(696)</code>.
 * @author Sean A. Irvine
 */
public class A042339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042339() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 2902, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 5, 8, 13, 21, 55, 2881, 5817, 8698, 14515, 23213, 37728, 60941, 159610});
  }
}
