package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262062 The first of six consecutive positive integers the sum of the squares of which is equal to the sum of the squares of seven consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262062 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262062() {
    super(1, new long[] {1, -27, 27}, new long[] {85, 2269, 58969});
  }
}
