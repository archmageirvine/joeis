package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011235.
 * @author Sean A. Irvine
 */
public class A011235 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(7), CR.valueOf(11).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
