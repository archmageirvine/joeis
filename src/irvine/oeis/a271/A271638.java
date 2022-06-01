package irvine.oeis.a271;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A271638 The total sum of the cubes of all parts of all compositions of n.
 * @author Sean A. Irvine
 */
public class A271638 extends LinearRecurrence {

  /** Construct the sequence. */
  public A271638() {
    super(new long[] {-4, 12, -13, 6}, new long[] {1, 10, 48, 170});
  }
}
