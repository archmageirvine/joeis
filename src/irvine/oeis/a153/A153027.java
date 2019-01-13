package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153027.
 * @author Sean A. Irvine
 */
public class A153027 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(19).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
