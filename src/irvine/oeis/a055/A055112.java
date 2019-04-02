package irvine.oeis.a055;

import irvine.oeis.LinearRecurrence;

/**
 * A055112 a(n) = n*(n+1)*(2*n+1).
 * @author Sean A. Irvine
 */
public class A055112 extends LinearRecurrence {

  /** Construct the sequence. */
  public A055112() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 6, 30, 84});
  }
}
