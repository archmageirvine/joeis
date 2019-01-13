package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A001961.
 * @author Sean A. Irvine
 */
public class A001961 extends BeattySequence {

  private static final CR N = CR.FIVE.sqrt().subtract(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
