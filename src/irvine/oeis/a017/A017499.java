package irvine.oeis.a017;

import irvine.oeis.LinearRecurrence;

/**
 * A017499 (11n+9)^3.
 * @author Sean A. Irvine
 */
public class A017499 extends LinearRecurrence {

  /** Construct the sequence. */
  public A017499() {
    super(new long[] {-1, 4, -6, 4}, new long[] {729, 8000, 29791, 74088});
  }
}
