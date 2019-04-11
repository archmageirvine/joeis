package irvine.oeis.a027;

import irvine.oeis.LinearRecurrence;

/**
 * A027765 <code>a(n) =</code> (n+1)*binomial(n+1,5).
 * @author Sean A. Irvine
 */
public class A027765 extends LinearRecurrence {

  /** Construct the sequence. */
  public A027765() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {5, 36, 147, 448, 1134, 2520, 5082});
  }
}
