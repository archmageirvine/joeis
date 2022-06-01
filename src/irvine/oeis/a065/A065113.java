package irvine.oeis.a065;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A065113 Sum of the squares of the a(n)-th and the (a(n)+1)st triangular numbers (A000217) is a perfect square.
 * @author Sean A. Irvine
 */
public class A065113 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065113() {
    super(new long[] {1, -7, 7}, new long[] {6, 40, 238});
  }
}
