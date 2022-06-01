package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139011 Real part of (2 + i)^n, where i = sqrt(-1).
 * @author Sean A. Irvine
 */
public class A139011 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139011() {
    super(new long[] {-5, 4}, new long[] {1, 2});
  }
}
