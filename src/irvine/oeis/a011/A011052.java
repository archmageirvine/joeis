package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011052.
 * @author Sean A. Irvine
 */
public class A011052 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(59), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
