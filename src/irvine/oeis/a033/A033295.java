package irvine.oeis.a033;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033295 a(n) = [ Gamma(sqrt(n)) ].
 * @author Sean A. Irvine
 */
public class A033295 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    return CR.valueOf(++mN).sqrt().lnGamma().exp().floor();
  }
}

