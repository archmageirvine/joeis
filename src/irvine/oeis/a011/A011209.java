package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011209.
 * @author Sean A. Irvine
 */
public class A011209 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(15).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
