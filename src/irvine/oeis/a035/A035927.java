package irvine.oeis.a035;

import irvine.oeis.LinearRecurrence;

/**
 * A035927 One less than number of n-multisets chosen from a 10-set.
 * @author Sean A. Irvine
 */
public class A035927 extends LinearRecurrence {

  /** Construct the sequence. */
  public A035927() {
    super(new long[] {-1, 10, -45, 120, -210, 252, -210, 120, -45, 10}, new long[] {0, 9, 54, 219, 714, 2001, 5004, 11439, 24309, 48619});
  }
}
