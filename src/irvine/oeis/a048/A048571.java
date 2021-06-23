package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A048571 Triangle read by rows: T(n,k) = number of distinct prime factors of C(n,k).
 * @author Sean A. Irvine
 */
public class A048571 implements Sequence {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(mFactor.factorize(Binomial.binomial(mN, mM)).omega());
  }
}

