package irvine.oeis.a003;

import irvine.math.cr.CR;
import irvine.oeis.BeattySequence;

/**
 * A003152 A Beatty sequence: <code>a(n) = floor(n*(1+1/sqrt(2)))</code>.
 * @author Sean A. Irvine
 */
public class A003152 extends BeattySequence {

  private static final CR N = CR.SQRT2.inverse().add(CR.ONE);

  @Override
  protected CR getCR() {
    return N;
  }
}
