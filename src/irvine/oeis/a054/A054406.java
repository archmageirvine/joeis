package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A054406 Beatty sequence for <code>(3+sqrt 3)/2;</code> complement of <code>A022838</code>.
 * @author Sean A. Irvine
 */
public class A054406 extends BeattySequence {

  private static final CR N = CR.THREE.add(CR.THREE.sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
