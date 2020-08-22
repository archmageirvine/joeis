package irvine.oeis.a290;

import irvine.oeis.LinearRecurrence;

/**
 * A290723 a(n) = (1/11520) * n*(n+7)^2 * (3*n^7 + 83*n^6 + 961*n^5 + 6201*n^4 + 24708*n^3 + 60700*n^2 + 87968*n + 85056).
 * @author Sean A. Irvine
 */
public class A290723 extends LinearRecurrence {

  /** Construct the sequence. */
  public A290723() {
    super(new long[] {1, -11, 55, -165, 330, -462, 462, -330, 165, -55, 11}, new long[] {0, 1476, 11772, 61595, 249986, 846306, 2495961, 6601035, 15978570, 35938992, 75976077});
  }
}
