package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090023 Number of distinct lines through the origin in the n-dimensional lattice of side length 7.
 * @author Sean A. Irvine
 */
public class A090023 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090023() {
    super(new long[] {192, -424, 330, -115, 18}, new long[] {0, 1, 37, 415, 3745});
  }
}
