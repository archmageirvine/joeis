package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011020.
 * @author Sean A. Irvine
 */
public class A011020 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(24), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
