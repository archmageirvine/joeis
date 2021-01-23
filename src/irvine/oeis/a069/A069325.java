package irvine.oeis.a069;

import irvine.oeis.LinearRecurrence;

/**
 * A069325 Number of 3 X n binary arrays with path of adjacent 1's from upper right corner to lower left corner.
 * @author Sean A. Irvine
 */
public class A069325 extends LinearRecurrence {

  /** Construct the sequence. */
  public A069325() {
    super(new long[] {4, -4, -8, 24, 3, -21, 9}, new long[] {1, 8, 51, 295, 1632, 8830, 47239});
  }
}
