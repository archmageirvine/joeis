package irvine.oeis.a153;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A153016.
 * @author Sean A. Irvine
 */
public class A153016 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.valueOf(13).log());

  @Override
  protected CR getCR() {
    return N;
  }
}
