package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275859.
 * @author Sean A. Irvine
 */
public class A275859 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275859() {
    super(new long[] {-1, 1, 0, -4, 5}, new long[] {1, 1, 5, 19, 76});
  }
}
