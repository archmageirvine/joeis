package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011062.
 * @author Sean A. Irvine
 */
public class A011062 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(70), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
