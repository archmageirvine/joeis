package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011198.
 * @author Sean A. Irvine
 */
public class A011198 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.FOUR, CR.valueOf(19).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
