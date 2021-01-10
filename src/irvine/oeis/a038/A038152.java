package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A038152 Beatty sequence for e^Pi.
 * @author Sean A. Irvine
 */
public class A038152 extends BeattySequence {

  private static final CR N = CR.PI.exp();

  @Override
  protected CR getCR() {
    return N;
  }
}
