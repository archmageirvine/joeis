package irvine.oeis.a046;

import irvine.factor.factor.PrimeDivision;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046097 Values of n for which binomial(2n-1, n) is squarefree.
 * @author Sean A. Irvine
 */
public class A046097 extends Sequence1 {

  private final PrimeDivision mFactor = new PrimeDivision();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (mFactor.factor(Binomial.binomial(2 * ++mN - 1, mN)).isSquareFree()) {
        return Z.valueOf(mN);
      }
    }
  }
}
