package irvine.oeis.a011;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A011333.
 * @author Sean A. Irvine
 */
public class A011333 extends DecimalExpansionSequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.valueOf(13), CR.valueOf(19).inverse());

  @Override
  protected CR getCR() {
    return N;
  }
}
