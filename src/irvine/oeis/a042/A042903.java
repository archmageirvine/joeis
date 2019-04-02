package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042903 Denominators of continued fraction convergents to sqrt(983).
 * @author Sean A. Irvine
 */
public class A042903 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042903() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 568176, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 2, 3, 17, 530, 2667, 3197, 9061, 564979, 1139019, 1703998, 9659009, 301133277, 1515325394, 1816458671, 5148242736L});
  }
}
