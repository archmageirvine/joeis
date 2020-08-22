package irvine.oeis.a098;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A098316 Decimal expansion of [3, 3, ...] = (3 + sqrt(13))/2.
 * @author Sean A. Irvine
 */
public class A098316 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.valueOf(13).sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
