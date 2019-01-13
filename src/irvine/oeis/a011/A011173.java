package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011173.
 * @author Sean A. Irvine
 */
public class A011173 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(88), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
