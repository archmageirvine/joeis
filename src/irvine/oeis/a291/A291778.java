package irvine.oeis.a291;

import irvine.oeis.LinearRecurrence;

/**
 * A291778 a(n) = 2^floor(2*n/3).
 * @author Sean A. Irvine
 */
public class A291778 extends LinearRecurrence {

  /** Construct the sequence. */
  public A291778() {
    super(new long[] {4, 0, 0}, new long[] {1, 1, 2});
  }
}
