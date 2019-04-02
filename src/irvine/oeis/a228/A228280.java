package irvine.oeis.a228;

import irvine.oeis.LinearRecurrence;

/**
 * A228280 Number of nX5 binary arrays with top left value 1 and no two ones adjacent horizontally, vertically or nw-se diagonally.
 * @author Sean A. Irvine
 */
public class A228280 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228280() {
    super(new long[] {1, -2, -8, 37, -57, 13, 68, -38, -69, 14, 48, 21, 1}, new long[] {5, 13, 112, 587, 3631, 21166, 126119, 745178, 4416695, 26150120, 154877307, 917205757, 5431915952L});
  }
}
