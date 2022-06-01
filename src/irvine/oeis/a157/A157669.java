package irvine.oeis.a157;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A157669 a(n) = 19683*n - 5967.
 * @author Sean A. Irvine
 */
public class A157669 extends LinearRecurrence {

  /** Construct the sequence. */
  public A157669() {
    super(new long[] {-1, 2}, new long[] {13716, 33399});
  }
}
