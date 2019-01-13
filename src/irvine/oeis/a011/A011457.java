package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011457.
 * @author Sean A. Irvine
 */
public class A011457 extends DecimalExpansionSequence {

  private static final CR M = CR.valueOf(38);
  private static final CR N = ComputableReals.SINGLETON.pow(M, M.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
