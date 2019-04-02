package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017188 a(n) = (9*n + 2)^4.
 * @author Sean A. Irvine
 */
public class A017188 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017188() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 14641, 160000, 707281, 2085136});
  }
}
