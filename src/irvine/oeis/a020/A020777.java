package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020777 Decimal expansion of (-1)*Gamma'(1/4)/Gamma(1/4) where Gamma(x) denotes the Gamma function.
 * @author Sean A. Irvine
 */
public class A020777 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020777() {
    super(CR.GAMMA.add(CR.TWO.log().multiply(CR.THREE)).add(CR.HALF_PI));
  }
}
