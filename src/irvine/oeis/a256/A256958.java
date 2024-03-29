package irvine.oeis.a256;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A256958 The integers (shown from -50 on).
 * @author Sean A. Irvine
 */
public class A256958 extends LinearRecurrence {

  /** Construct the sequence. */
  public A256958() {
    super(-50, new long[] {-1, 2}, new long[] {-50, -49});
  }
}
