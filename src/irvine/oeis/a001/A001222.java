package irvine.oeis.a001;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001222 Number of prime divisors of n counted with multiplicity (also called bigomega(n) or Omega(n)).
 * @author Sean A. Irvine
 */
public class A001222 implements Sequence {

  protected long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(Cheetah.factor(mN).bigOmega());
  }
}
