package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017032 a(n) = (7*n + 4)^4.
 * @author Sean A. Irvine
 */
public class A017032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017032() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {256, 14641, 104976, 390625, 1048576});
  }
}
