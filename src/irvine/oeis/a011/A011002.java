package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;
import irvine.math.cr.ComputableReals;

/**
 * A011002.
 * @author Sean A. Irvine
 */
public class A011002 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.THREE, CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
