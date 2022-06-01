package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017320 a(n) = (10*n + 4)^4.
 * @author Sean A. Irvine
 */
public class A017320 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017320() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {256, 38416, 331776, 1336336, 3748096});
  }
}
