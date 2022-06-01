package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262019 The first of eleven consecutive positive integers the sum of the squares of which is equal to the sum of the squares of five consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262019 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262019() {
    super(new long[] {1, -179, 179}, new long[] {15, 3575, 637215});
  }
}
