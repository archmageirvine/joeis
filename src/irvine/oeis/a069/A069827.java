package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069827 Numbers k such that sigma(core(k)) = tau(k) where core(k) is the squarefree part of k, tau(k) is the number of divisors of k, and sigma(k) is their sum.
 * @author Sean A. Irvine
 */
public class A069827 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(Functions.CORE.z(++mN)).equals(Functions.SIGMA0.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}

