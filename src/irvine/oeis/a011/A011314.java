package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011314.
 * @author Sean A. Irvine
 */
public class A011314 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(15).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
