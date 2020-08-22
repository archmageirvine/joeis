package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A054385 Beatty sequence for e/(e-1); complement of A022843.
 * @author Sean A. Irvine
 */
public class A054385 extends BeattySequence {

  private static final CR N = CR.E.divide(CR.E.subtract(CR.ONE));

  @Override
  protected CR getCR() {
    return N;
  }
}
