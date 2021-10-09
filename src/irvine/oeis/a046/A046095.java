package irvine.oeis.a046;

import irvine.math.cr.CR;
import irvine.math.polynomial.Polynomial;
import irvine.oeis.cons.PolynomialRootExpansionSequence;

/**
 * A046095 Decimal expansion of Calabi's constant.
 * @author Sean A. Irvine
 */
public class A046095 extends PolynomialRootExpansionSequence {

  /** Construct the sequence. */
  public A046095() {
    super(Polynomial.create(2, -3, -2, 2), CR.ONE, CR.TWO);
  }
}
