package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262017 The first of five consecutive positive integers the sum of the squares of which is equal to the sum of the squares of six consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262017 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262017() {
    super(1, new long[] {1, -23, 23}, new long[] {61, 1381, 30361});
  }
}
