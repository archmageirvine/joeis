package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011042.
 * @author Sean A. Irvine
 */
public class A011042 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(48), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
