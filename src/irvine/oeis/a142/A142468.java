package irvine.oeis.a142;

import irvine.oeis.a056.A056940;

/**
 * A142468 An eight-products triangle sequence of coefficients: T(n,k) = binomial(n,k) * Product_{j=1..7} j!*(n+j)!/((k+j)!*(n-k+j)!).
 * @author Sean A. Irvine
 */
public class A142468 extends A056940 {

  /** Construct the sequence. */
  public A142468() {
    super(7);
  }
}

