package irvine.oeis.a017;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A017392 a(n) = (11*n)^4.
 * @author Sean A. Irvine
 */
public class A017392 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017392() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 14641, 234256, 1185921, 3748096});
  }
}
