package irvine.oeis.a262;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A262018 The first of five consecutive positive integers the sum of the squares of which is equal to the sum of the squares of eleven consecutive positive integers.
 * @author Sean A. Irvine
 */
public class A262018 extends LinearRecurrence {

  /** Construct the sequence. */
  public A262018() {
    super(new long[] {1, -179, 179}, new long[] {28, 5308, 945148});
  }
}
