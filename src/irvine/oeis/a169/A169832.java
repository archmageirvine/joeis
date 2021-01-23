package irvine.oeis.a169;

import irvine.oeis.LinearRecurrence;

/**
 * A169832 a(n) = 15*2^(n+1) - (5*n^2+22*n+30).
 * @author Sean A. Irvine
 */
public class A169832 extends LinearRecurrence {

  /** Construct the sequence. */
  public A169832() {
    super(new long[] {-2, 7, -9, 5}, new long[] {0, 3, 26, 99});
  }
}
