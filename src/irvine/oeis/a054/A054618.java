package irvine.oeis.a054;

import irvine.math.z.Euler;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054618 Triangle T(n,k) = Sum_{d|n} phi(d)*k^(n/d).
 * @author Sean A. Irvine
 */
public class A054618 implements Sequence {

  private int mN = 0;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return Integers.SINGLETON.sumdiv(mN, d -> Euler.phi(Z.valueOf(d)).multiply(Z.valueOf(mM).pow(mN / d)));
  }
}
