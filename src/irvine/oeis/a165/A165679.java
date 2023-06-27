package irvine.oeis.a165;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A165679 Seventh right hand column of triangle A165674.
 * @author Sean A. Irvine
 */
public class A165679 extends LinearRecurrence {

  /** Construct the sequence. */
  public A165679() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {13068, 69264, 241128, 662640, 1557660, 3272688, 6314664});
  }
}
