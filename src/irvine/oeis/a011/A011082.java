package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011082.
 * @author Sean A. Irvine
 */
public class A011082 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(91), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
