package irvine.oeis.a050;

import irvine.oeis.LinearRecurrence;

/**
 * A050534 Tritriangular numbers: <code>a(n) =</code> binomial(binomial(n,2),2) <code>= n(n + 1)(n - 1)(n - 2)/8</code>.
 * @author Sean A. Irvine
 */
public class A050534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A050534() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {0, 0, 0, 3, 15});
  }
}
