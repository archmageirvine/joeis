package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022840 Beatty sequence for <code>sqrt(6)</code>.
 * @author Sean A. Irvine
 */
public class A022840 extends BeattySequence {

  private static final CR N = CR.valueOf(6).sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
