package irvine.oeis.a220;

import irvine.oeis.LinearRecurrence;

/**
 * A220978 <code>a(n) = 3^(2*n+1) - 3^(n+1) + 1</code>: The left Aurifeuillian factor of <code>3^(6*n+3) + 1</code>.
 * @author Sean A. Irvine
 */
public class A220978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A220978() {
    super(new long[] {27, -39, 13}, new long[] {1, 19, 217});
  }
}
