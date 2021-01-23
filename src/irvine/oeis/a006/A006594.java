package irvine.oeis.a006;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A006594 A Beatty sequence: [ n(1 + 1/e) ].
 * @author Sean A. Irvine
 */
public class A006594 extends BeattySequence {

  private static final CR N = CR.E.inverse().add(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
