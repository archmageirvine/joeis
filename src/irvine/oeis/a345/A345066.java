package irvine.oeis.a345;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A345066 Decimal expansion of phi^gamma, where gamma is the Euler-Mascheroni constant.
 * @author Sean A. Irvine
 */
public class A345066 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A345066() {
    super(ComputableReals.SINGLETON.pow(CR.PHI, CR.GAMMA));
  }
}
