package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011276.
 * @author Sean A. Irvine
 */
public class A011276 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(10), CR.valueOf(7).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
