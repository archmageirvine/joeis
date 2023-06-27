package irvine.oeis.a136;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A136433 a(n+2)=a(n+1)*(n mod 3 + 1) + (n mod 2 + 1), a(1)=11.
 * @author Sean A. Irvine
 */
public class A136433 extends LinearRecurrence {

  /** Construct the sequence. */
  public A136433() {
    super(1, new long[] {-6, 0, 0, 1, 0, 0, 6, 0, 0}, new long[] {11, 12, 26, 79, 81, 163, 491, 492, 986});
  }
}
