package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A001962 A Beatty sequence: <code>floor(n * (sqrt(5) + 3))</code>.
 * @author Sean A. Irvine
 */
public class A001962 extends BeattySequence {

  private static final CR N = CR.FIVE.sqrt().add(CR.THREE);

  @Override
  protected CR getCR() {
    return N;
  }
}
