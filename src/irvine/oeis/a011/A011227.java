package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011227.
 * @author Sean A. Irvine
 */
public class A011227 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(6), CR.valueOf(18).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
