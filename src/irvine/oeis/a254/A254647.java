package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254647 Fourth partial sums of eighth powers (A001016).
 * @author Sean A. Irvine
 */
public class A254647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254647() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 260, 7595, 94360, 723534, 4037712, 17944290, 67127880, 219319815, 642251428, 1718012933, 4258676240L, 9892043980L});
  }
}
