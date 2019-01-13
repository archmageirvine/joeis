package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A054406.
 * @author Sean A. Irvine
 */
public class A054406 extends BeattySequence {

  private static final CR N = CR.THREE.add(CR.THREE.sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
