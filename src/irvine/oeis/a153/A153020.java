package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153020.
 * @author Sean A. Irvine
 */
public class A153020 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(17).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
