package irvine.oeis.a193;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A193132 a(n) = 3n*4^(2n-1).
 * @author Sean A. Irvine
 */
public class A193132 extends LinearRecurrence {

  /** Construct the sequence. */
  public A193132() {
    super(1, new long[] {-256, 32}, new long[] {12, 384});
  }
}
