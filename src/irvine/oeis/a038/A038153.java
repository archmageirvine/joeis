package irvine.oeis.a038;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.BeattySequence;

/**
 * A038153 Beatty sequence for Pi^e.
 * @author Sean A. Irvine
 */
public class A038153 extends BeattySequence {

  private static final CR N = ComputableReals.SINGLETON.pow(CR.PI, CR.E);

  @Override
  protected CR getCR() {
    return N;
  }
}
