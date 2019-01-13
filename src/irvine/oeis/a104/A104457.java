package irvine.oeis.a104;

import irvine.math.cr.CR;
import irvine.oeis.DecimalExpansionSequence;

/**
 * A104457.
 * @author Sean A. Irvine
 */
public class A104457 extends DecimalExpansionSequence {

  private static final CR N = CR.THREE.add(CR.FIVE.sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
