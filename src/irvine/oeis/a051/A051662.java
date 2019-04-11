package irvine.oeis.a051;

import irvine.oeis.LinearRecurrence;

/**
 * A051662 House numbers: <code>a(n) = (n+1)^3 +</code> Sum_{i=1..n} i^2.
 * @author Sean A. Irvine
 */
public class A051662 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051662() {
    super(new long[] {-1, 4, -6, 4}, new long[] {1, 9, 32, 78});
  }
}
