package irvine.oeis.a307;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.oeis.a226.A226775;

/**
 * A307951 Decimal expansion of 1 - log(2)/log(-W(-2/e^2)), where W is Lambert's W function.
 * @author Sean A. Irvine
 */
public class A307951 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A307951() {
    super(CR.ONE.subtract(CR.TWO.log().divide(A226775.N.log())));
  }
}
