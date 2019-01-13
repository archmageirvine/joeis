package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011024.
 * @author Sean A. Irvine
 */
public class A011024 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(29), CR.FOUR.inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
