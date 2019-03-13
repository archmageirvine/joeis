package irvine.oeis.a161;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A161012.
 * @author Sean A. Irvine
 */
public class A161012 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.tan(CR.ONE_THIRD);

  @Override
  protected CR getCR() {
    return N;
  }
}
