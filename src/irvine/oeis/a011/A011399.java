package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011399.
 * @author Sean A. Irvine
 */
public class A011399 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(18), CR.valueOf(10).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
