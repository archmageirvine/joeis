package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011078.
 * @author Sean A. Irvine
 */
public class A011078 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(87), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
