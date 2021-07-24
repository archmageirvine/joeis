package irvine.oeis.a068;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A068959 Decimal expansion of the smallest solution &gt; Pi/2 to sin(x)=sin(x^2).
 * @author Sean A. Irvine
 */
public class A068959 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A068959() {
    super(CR.PI.multiply(12).add(CR.ONE).sqrt().subtract(CR.ONE).divide(CR.TWO));
  }
}
