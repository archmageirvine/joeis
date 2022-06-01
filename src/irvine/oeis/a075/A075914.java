package irvine.oeis.a075;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A075914 Sixth column of triangle A075500.
 * @author Sean A. Irvine
 */
public class A075914 extends LinearRecurrence {

  /** Construct the sequence. */
  public A075914() {
    super(new long[] {-11250000, 5512500, -1015000, 91875, -4375, 105}, new long[] {1, 105, 6650, 330750, 14266875, 560896875});
  }
}
