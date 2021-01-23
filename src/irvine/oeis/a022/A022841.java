package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022841 Beatty sequence for sqrt(7).
 * @author Sean A. Irvine
 */
public class A022841 extends BeattySequence {

  private static final CR N = CR.SEVEN.sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
