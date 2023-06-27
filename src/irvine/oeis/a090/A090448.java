package irvine.oeis.a090;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A090448 Fourth column (m=3) of triangle A090447.
 * @author Sean A. Irvine
 */
public class A090448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090448() {
    super(3, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {9, 96, 500, 1800, 5145, 12544, 27216});
  }
}
