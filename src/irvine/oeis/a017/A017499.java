package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017499 <code>a(n) = (11*n + 9)^3</code>.
 * @author Sean A. Irvine
 */
public class A017499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017499() {
    super(new long[] {-1, 4, -6, 4}, new long[] {729, 8000, 29791, 74088});
  }
}
