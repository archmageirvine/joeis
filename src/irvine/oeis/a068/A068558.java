package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068558 Decimal expansion of the smallest solution &gt;0 to cos(x)=cos(x^2).
 * @author Sean A. Irvine
 */
public class A068558 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068558() {
    super(CR.PI.multiply(8).add(CR.ONE).sqrt().subtract(CR.ONE).divide(CR.TWO));
  }
}
