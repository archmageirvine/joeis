package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017081 a(n) = (8*n + 1)^5.
 * @author Sean A. Irvine
 */
public class A017081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017081() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 59049, 1419857, 9765625, 39135393, 115856201});
  }
}
