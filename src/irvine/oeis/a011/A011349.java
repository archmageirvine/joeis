package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011349.
 * @author Sean A. Irvine
 */
public class A011349 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(14), CR.valueOf(20).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
