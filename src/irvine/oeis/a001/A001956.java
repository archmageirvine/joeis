package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A001956 Beatty sequence of (5+sqrt(13))/2.
 * @author Sean A. Irvine
 */
public class A001956 extends BeattySequence {

  private static final CR N = CR.FIVE.add(CR.valueOf(13).sqrt()).divide(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
