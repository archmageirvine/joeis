package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011046.
 * @author Sean A. Irvine
 */
public class A011046 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(53), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
