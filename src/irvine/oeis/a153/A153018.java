package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153018.
 * @author Sean A. Irvine
 */
public class A153018 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(15).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
