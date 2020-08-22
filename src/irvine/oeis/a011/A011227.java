package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011227 Decimal expansion of 18th root of 6.
 * @author Sean A. Irvine
 */
public class A011227 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.SIX, CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
