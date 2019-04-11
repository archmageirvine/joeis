package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022838 Beatty sequence for <code>sqrt(3)</code>; complement of A054406.
 * @author Sean A. Irvine
 */
public class A022838 extends BeattySequence {

  private static final CR N = CR.THREE.sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
