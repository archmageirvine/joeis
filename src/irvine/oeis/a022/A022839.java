package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022839 Beatty sequence for sqrt(5).
 * @author Sean A. Irvine
 */
public class A022839 extends BeattySequence {

  private static final CR N = CR.FIVE.sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
