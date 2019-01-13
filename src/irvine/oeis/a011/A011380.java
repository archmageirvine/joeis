package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011380.
 * @author Sean A. Irvine
 */
public class A011380 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(6).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
