package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051876 24-gonal numbers: <code>a(n) = n*(11*n-10)</code>.
 * @author Sean A. Irvine
 */
public class A051876 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051876() {
    super(new long[] {1, -3, 3}, new long[] {0, 1, 24});
  }
}
