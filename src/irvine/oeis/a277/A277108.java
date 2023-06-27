package irvine.oeis.a277;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A277108 a(n) = 4n*(n+5).
 * @author Sean A. Irvine
 */
public class A277108 extends LinearRecurrence {

  /** Construct the sequence. */
  public A277108() {
    super(1, new long[] {1, -3, 3}, new long[] {24, 56, 96});
  }
}
