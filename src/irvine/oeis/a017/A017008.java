package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017008 a(n) = (7*n + 2)^4.
 * @author Sean A. Irvine
 */
public class A017008 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017008() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {16, 6561, 65536, 279841, 810000});
  }
}
