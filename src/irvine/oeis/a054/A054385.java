package irvine.oeis.a054;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A054385 Beatty sequence for <code>e/(e-1)</code>; complement of <code>A022843</code>.
 * @author Sean A. Irvine
 */
public class A054385 extends BeattySequence {

  private static final CR N = CR.E.divide(CR.E.subtract(CR.ONE));

  @Override
  protected CR getCR() {
    return N;
  }
}
