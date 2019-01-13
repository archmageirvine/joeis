package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011031.
 * @author Sean A. Irvine
 */
public class A011031 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(37), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
