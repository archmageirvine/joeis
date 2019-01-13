package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011206.
 * @author Sean A. Irvine
 */
public class A011206 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FIVE, CR.valueOf(12).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
