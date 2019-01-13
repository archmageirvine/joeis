package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011410.
 * @author Sean A. Irvine
 */
public class A011410 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(19), CR.valueOf(6).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
