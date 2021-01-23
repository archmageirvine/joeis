package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011250 Decimal expansion of 11th root of 8.
 * @author Sean A. Irvine
 */
public class A011250 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.EIGHT, CR.valueOf(11).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
