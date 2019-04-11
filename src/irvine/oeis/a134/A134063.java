package irvine.oeis.a134;

import irvine.oeis.LinearRecurrence;

/**
 * A134063 <code>a(n) = (1/2)*(3^n - 2^(n+1) + 3)</code>.
 * @author Sean A. Irvine
 */
public class A134063 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134063() {
    super(new long[] {6, -11, 6}, new long[] {1, 1, 2});
  }
}
