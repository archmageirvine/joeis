package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011056.
 * @author Sean A. Irvine
 */
public class A011056 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(63), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
