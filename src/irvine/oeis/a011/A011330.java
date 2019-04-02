package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011330 Decimal expansion of 16th root of 13.
 * @author Sean A. Irvine
 */
public class A011330 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(16).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
