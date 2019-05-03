package irvine.oeis.a000;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.oeis.BeattySequence;

/**
 * A000572 A Beatty sequence: <code>[ n(e+1) ]</code>.
 * @author Sean A. Irvine
 */
public class A000572 extends BeattySequence {

  private static final CR N = ComputableReals.SINGLETON.exp(CR.ONE).add(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
