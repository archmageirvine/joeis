package irvine.oeis.a244;

import irvine.oeis.LinearRecurrence;

/**
 * A244878 Number of <code>6 X 6</code> traceless symmetric magic squares with magic sum <code>n</code>.
 * @author Sean A. Irvine
 */
public class A244878 extends LinearRecurrence {

  /** Construct the sequence. */
  public A244878() {
    super(new long[] {-1, 9, -35, 75, -90, 42, 42, -90, 75, -35, 9}, new long[] {1, 15, 130, 760, 3355, 12043, 36935, 100135, 245870, 556580, 1177295});
  }
}
