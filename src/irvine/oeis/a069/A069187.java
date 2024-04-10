package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A069187 Numbers k such that core(k) = ceiling(sqrt(k)) where core(k) is the squarefree part of k (the smallest integer such that k*core(k) is a square).
 * @author Sean A. Irvine
 */
public class A069187 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Jaguar.factor(mN).core().equals(ZUtils.ceilSqrt(mN))) {
        return mN;
      }
    }
  }
}

