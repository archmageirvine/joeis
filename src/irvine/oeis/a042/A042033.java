package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042033 Denominators of continued fraction convergents to <code>sqrt(540)</code>.
 * @author Sean A. Irvine
 */
public class A042033 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042033() {
    super(new long[] {-1, 0, 0, 0, 0, 0, 0, 0, 238142, 0, 0, 0, 0, 0, 0, 0}, new long[] {1, 4, 17, 21, 227, 248, 1219, 5124, 236923, 952816, 4048187, 5001003, 54058217, 59059220, 290295097, 1220239608});
  }
}
