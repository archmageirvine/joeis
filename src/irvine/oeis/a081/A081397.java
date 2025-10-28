package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081397 a(n) = least k such that GCD of sigma(k) = A000203(k) and phi(k) = A000010(k) equals n-th primorial = A002110(n).
 * @author Sean A. Irvine
 */
public class A081397 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long p = Functions.PRIMORIAL_COUNT.l(++mN);
    long k = 0;
    while (true) {
      if (Functions.GCD.l(Functions.SIGMA1.l(++k), Functions.PHI.l(k)) == p) {
        return Z.valueOf(k);
      }
    }
  }
}

