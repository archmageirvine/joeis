package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011384.
 * @author Sean A. Irvine
 */
public class A011384 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(17), CR.valueOf(10).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
