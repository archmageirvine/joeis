package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A003511.
 * @author Sean A. Irvine
 */
public class A003511 extends BeattySequence {

  private static final CR N = CR.ONE.add(CR.THREE.sqrt()).multiply(CR.HALF);

  @Override
  protected CR getCR() {
    return N;
  }
}
