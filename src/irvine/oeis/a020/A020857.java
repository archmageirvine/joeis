package irvine.oeis.a020;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A020857.
 * @author Sean A. Irvine
 */
public class A020857 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.log().divide(CR.TWO.log());

  @Override
  protected CR getCR() {
    return N;
  }
}
