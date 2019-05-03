package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090448 Fourth column <code>(m=3)</code> of triangle <code>A090447</code>.
 * @author Sean A. Irvine
 */
public class A090448 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090448() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {9, 96, 500, 1800, 5145, 12544, 27216});
  }
}
