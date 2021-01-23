package irvine.oeis.a001;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A001952 A Beatty sequence: a(n) = floor(n*(2 + sqrt(2))).
 * @author Sean A. Irvine
 */
public class A001952 extends BeattySequence {

  private static final CR N = CR.SQRT2.add(CR.TWO);

  @Override
  protected CR getCR() {
    return N;
  }
}
