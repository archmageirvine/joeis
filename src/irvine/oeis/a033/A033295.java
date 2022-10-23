package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033295 a(n) = [ Gamma(sqrt(n)) ].
 * @author Sean A. Irvine
 */
public class A033295 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().lnGamma().exp().floor();
  }
}

