package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A011226 Decimal expansion of 17th root of 6.
 * @author Sean A. Irvine
 */
public class A011226 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A011226() {
    super(ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(17).inverse()));
  }
}
