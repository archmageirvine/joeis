package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041295 Denominators of continued fraction convergents to <code>sqrt(160)</code>.
 * @author Sean A. Irvine
 */
public class A041295 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041295() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 1442, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 1, 2, 3, 17, 20, 37, 57, 1405, 1462, 2867, 4329, 24512, 28841, 53353, 82194});
  }
}
