package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139276 <code>a(n) = n*(8*n+3)</code>.
 * @author Sean A. Irvine
 */
public class A139276 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139276() {
    super(new long[] {1, -3, 3}, new long[] {0, 11, 38});
  }
}
