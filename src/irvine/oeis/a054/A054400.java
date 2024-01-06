package irvine.oeis.a054;

import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A054400 Decimal expansion of 4 * Product_{i=1..inf} (1-3/(2*(i+1)))^(1/2^i).
 * @author Sean A. Irvine
 */
public class A054400 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A054400() {
    super(A054399.N.multiply(4));
  }
}
