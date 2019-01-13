package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011058.
 * @author Sean A. Irvine
 */
public class A011058 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(66), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
