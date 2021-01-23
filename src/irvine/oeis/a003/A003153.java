package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.RoundingBeattySequence;

/**
 * A003153 a(n) = integer nearest n*(1+sqrt(2)).
 * @author Sean A. Irvine
 */
public class A003153 extends RoundingBeattySequence {

  private static final CR N = CR.SQRT2.add(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
