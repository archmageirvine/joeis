package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011126.
 * @author Sean A. Irvine
 */
public class A011126 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(41), CR.FIVE.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
