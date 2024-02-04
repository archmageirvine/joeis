package irvine.oeis.a001;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A001222 Number of prime divisors of n counted with multiplicity (also called big omega of n, bigomega(n) or Omega(n)).
 * @author Sean A. Irvine
 */
public class A001222 extends Sequence1 implements DirectSequence {

  protected long mN = 0;

  @Override
  public Z a(final Z n) {
    return n.equals(Z.ONE) ? Z.ZERO : Z.valueOf(Jaguar.factor(n).bigOmega());
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    return Z.valueOf(Jaguar.factor(mN).bigOmega());
  }
}
