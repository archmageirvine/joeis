package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262063 The first of seven consecutive positive integers the sum of the squares of which is equal to the sum of the squares of six consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262063() {
    super(1, new long[] {1, -27, 27}, new long[] {78, 2100, 54594});
  }
}
