package irvine.oeis.a288;

import irvine.oeis.LinearRecurrence;

/**
 * A288913 <code>a(n) = Lucas(4*n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A288913 extends LinearRecurrence {

  /** Construct the sequence. */
  public A288913() {
    super(new long[] {-1, 7}, new long[] {4, 29});
  }
}
