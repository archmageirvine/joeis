package irvine.oeis.a263;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A263228 a(n) = 2*n*(16*n - 13).
 * @author Sean A. Irvine
 */
public class A263228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A263228() {
    super(new long[] {1, -3, 3}, new long[] {0, 6, 76});
  }
}
