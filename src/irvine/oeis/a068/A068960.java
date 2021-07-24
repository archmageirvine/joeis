package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068960 Decimal expansion of the fifth smallest positive real root of sin(x) - sin(x^3) = 0.
 * @author Sean A. Irvine
 */
public class A068960 extends DecimalExpansionSequence {

  private static final CR C = CR.PI.multiply(CR.PI).multiply(675).add(CR.FOUR).multiply(3).sqrt().add(CR.PI.multiply(45)).multiply(3).pow(CR.ONE_THIRD);

  /** Construct the sequence. */
  public A068960() {
    super(C.multiply(C).multiply(CR.TWO.pow(CR.ONE_THIRD)).subtract(CR.SIX).divide(C.multiply(CR.FOUR.pow(CR.ONE_THIRD)).multiply(3)));
  }
}
