package irvine.oeis.a123;

import irvine.oeis.LinearRecurrence;

/**
 * A123228 Sum of the n-th powers of the roots of the polynomial <code>x^6 + 14x^5 + 87x^4 + 148x^3 + 87x^2 + 14x + 1</code>.
 * @author Sean A. Irvine
 */
public class A123228 extends LinearRecurrence {

  /** Construct the sequence. */
  public A123228() {
    super(new long[] {-1, -13, -74, -74, -13}, new long[] {6, -14, 22, 466, -6714});
  }
}
