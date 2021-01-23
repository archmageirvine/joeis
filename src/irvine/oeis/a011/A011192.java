package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011192 Decimal expansion of 13th root of 4.
 * @author Sean A. Irvine
 */
public class A011192 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FOUR, CR.valueOf(13).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
