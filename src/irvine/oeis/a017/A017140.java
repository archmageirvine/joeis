package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017140 a(n) = (8*n+6)^4.
 * @author Sean A. Irvine
 */
public class A017140 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017140() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1296, 38416, 234256, 810000, 2085136});
  }
}
