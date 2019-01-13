package irvine.oeis.a007;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A007507.
 * @author Sean A. Irvine
 */
public class A007507 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.TWO, CR.TWO.sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
