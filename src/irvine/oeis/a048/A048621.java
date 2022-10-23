package irvine.oeis.a048;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A048621 a(n) = A001222(A001405(n)).
 * @author Sean A. Irvine
 */
public class A048621 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(mFactor.factorize(Binomial.binomial(++mN, mN / 2)).bigOmega());
  }
}

