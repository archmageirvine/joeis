package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A020759 Decimal expansion of (-1)*Gamma'(1/2)/Gamma(1/2) where Gamma(x) denotes the Gamma function.
 * @author Sean A. Irvine
 */
public class A020759 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A020759() {
    super(CR.GAMMA.add(CR.TWO.log().multiply(CR.TWO)));
  }
}
