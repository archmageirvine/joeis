package irvine.oeis.a046;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046098 Numbers n such that central binomial coefficient C(n, floor(n/2)) is squarefree.
 * @author Sean A. Irvine
 */
public class A046098 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      if (mFactor.factorize(Binomial.binomial(++mN, mN / 2)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
