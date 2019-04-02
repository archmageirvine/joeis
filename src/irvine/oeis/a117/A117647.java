package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117647 a(2n) = A014445(n), a(2n+1) = A015448(n+1).
 * @author Sean A. Irvine
 */
public class A117647 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117647() {
    super(new long[] {1, 0, 4, 0}, new long[] {0, 1, 2, 5});
  }
}
