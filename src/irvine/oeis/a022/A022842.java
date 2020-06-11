package irvine.oeis.a022;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A022842 Beatty sequence for <code>sqrt(8)</code>.
 * @author Sean A. Irvine
 */
public class A022842 extends BeattySequence {

  private static final CR N = CR.EIGHT.sqrt();

  @Override
  protected CR getCR() {
    return N;
  }
}
