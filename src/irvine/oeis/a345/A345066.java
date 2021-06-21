package irvine.oeis.a345;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A345066.
 * @author Sean A. Irvine
 */
public class A345066 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.PHI, CR.GAMMA);

  @Override
  protected CR getCR() {
    return N;
  }
}
