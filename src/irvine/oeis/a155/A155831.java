package irvine.oeis.a155;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A155831.
 * @author Sean A. Irvine
 */
public class A155831 extends DecimalExpansionSequence {

  private static final CR N = CR.valueOf(23).log().divide(CR.valueOf(11).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
