package irvine.oeis.a059;

import irvine.oeis.LinearRecurrence;

/**
 * A059978 <code>a(n) =</code> binomial(n+2,n)^6.
 * @author Sean A. Irvine
 */
public class A059978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A059978() {
    super(new long[] {1, -13, 78, -286, 715, -1287, 1716, -1716, 1287, -715, 286, -78, 13}, new long[] {1, 729, 46656, 1000000, 11390625, 85766121, 481890304, 2176782336L, 8303765625L, 27680640625L, 82653950016L, 225199600704L, 567869252041L});
  }
}
