package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.factor.factor.PrimeDivision;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053044 a(n) is the number of iterations of the Euler totient function to reach 1, starting at n!.
 * @author Sean A. Irvine
 */
public class A053044 implements Sequence {

  private final FactorSequence mFactorSequence = new FactorSequence();
  private final PrimeDivision mFactor = new PrimeDivision();
  protected int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    mFactorSequence.merge(mFactor.factorize(Z.valueOf(mN)));
    long cnt = 0;
    FactorSequence fs = mFactorSequence;
    Z s;
    do {
      ++cnt;
      s = fs.phi();
      fs = Jaguar.factor(s);
    } while (!Z.ONE.equals(s));
    return Z.valueOf(cnt);
  }
}
