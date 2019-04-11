package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A003512 A Beatty sequence: <code>floor(n*(sqrt(3) + 2))</code>.
 * @author Sean A. Irvine
 */
public class A003512 extends BeattySequence {

  private static final CR N = CR.TWO.add(CR.THREE.sqrt());

  @Override
  protected CR getCR() {
    return N;
  }
}
