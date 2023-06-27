package irvine.oeis.a024;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A024197 a(n) = 3rd elementary symmetric function of the first n+2 odd positive integers.
 * @author Sean A. Irvine
 */
public class A024197 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024197() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {15, 176, 950, 3480, 10045, 24640, 53676});
  }
}
