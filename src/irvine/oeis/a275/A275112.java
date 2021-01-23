package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275112 Zero together with the partial sums of A064412.
 * @author Sean A. Irvine
 */
public class A275112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275112() {
    super(new long[] {1, -3, 2, 2, -4, 4, -2, -2, 3}, new long[] {0, 1, 6, 20, 52, 112, 215, 375, 613});
  }
}
