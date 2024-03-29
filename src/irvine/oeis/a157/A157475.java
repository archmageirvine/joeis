package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157475 a(n) = 512n + 16.
 * @author Sean A. Irvine
 */
public class A157475 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157475() {
    super(1, new long[] {-1, 2}, new long[] {528, 1040});
  }
}
