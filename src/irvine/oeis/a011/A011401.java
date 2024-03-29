package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011401 Decimal expansion of 12th root of 18.
 * @author Sean A. Irvine
 */
public class A011401 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011401() {
    super(ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(12).inverse()));
  }
}
