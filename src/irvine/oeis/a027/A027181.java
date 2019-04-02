package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027181 a(n) = Lucas(n+4) - (2n+6).
 * @author Sean A. Irvine
 */
public class A027181 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027181() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 3, 8, 17});
  }
}
