package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A006594 A Beatty sequence: <code>[ n(1 +</code> 1/e) ].
 * @author Sean A. Irvine
 */
public class A006594 extends BeattySequence {

  private static final CR N = CR.E.inverse().add(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
