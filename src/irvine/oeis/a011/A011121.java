package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011121.
 * @author Sean A. Irvine
 */
public class A011121 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(36), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
