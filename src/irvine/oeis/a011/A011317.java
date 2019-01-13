package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011317.
 * @author Sean A. Irvine
 */
public class A011317 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(12), CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
