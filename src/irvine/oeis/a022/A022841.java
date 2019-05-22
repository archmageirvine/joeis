package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022841 Beatty sequence for <code>sqrt(7)</code>.
 * @author Sean A. Irvine
 */
public class A022841 extends BeattySequence {

  private static final CR N = CR.valueOf(7).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
