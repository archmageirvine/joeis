package irvine.oeis.a049;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A049149 Numbers k such that the Euler totient function phi(k) is squarefree.
 * @author Sean A. Irvine
 */
public class A049149 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Cheetah.factor(Euler.phi(mN)).isSquareFree()) {
        return mN;
      }
    }
  }
}

