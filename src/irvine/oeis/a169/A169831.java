package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169831 a(n) = 5*2^(n+1) - 3*(n+3).
 * @author Sean A. Irvine
 */
public class A169831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169831() {
    super(new long[] {2, -5, 4}, new long[] {1, 8, 25});
  }
}
