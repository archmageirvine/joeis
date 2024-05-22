package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069552 Numbers k such that phi(k) = sigma(core(k)) where phi(k) is the Euler totient function, sigma(k) the sum of divisors of k and core(k) the squarefree part of k (the smallest integer such that k*core(k) is a square).
 * @author Sean A. Irvine
 */
public class A069552 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.PHI.z(++mN).equals(Functions.SIGMA1.z(Functions.CORE.l(mN)))) {
        return Z.valueOf(mN);
      }
    }
  }
}
