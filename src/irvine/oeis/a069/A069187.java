package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
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
      if (Functions.CORE.z(mN).equals(Functions.CEIL_SQRT.z(mN))) {
        return mN;
      }
    }
  }
}

