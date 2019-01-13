package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011041.
 * @author Sean A. Irvine
 */
public class A011041 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(47), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
