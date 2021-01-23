package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011372 Decimal expansion of 13th root of 16.
 * @author Sean A. Irvine
 */
public class A011372 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(16), CR.valueOf(13).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
