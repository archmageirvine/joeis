package irvine.oeis.a254;

import irvine.oeis.LinearRecurrence;

/**
 * A254640 Third partial sums of sixth powers <code>(A001014)</code>.
 * @author Sean A. Irvine
 */
public class A254640 extends LinearRecurrence {

  /** Construct the sequence. */
  public A254640() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {1, 67, 927, 6677, 32942, 126378, 404634, 1129854, 2833479, 6515509});
  }
}
