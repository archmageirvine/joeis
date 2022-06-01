package irvine.oeis.a134;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A134175 a(n) = (32/2)*(n-1)*(n-2)*(n-3)*(n-4).
 * @author Sean A. Irvine
 */
public class A134175 extends LinearRecurrence {

  /** Construct the sequence. */
  public A134175() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 0, 384});
  }
}
