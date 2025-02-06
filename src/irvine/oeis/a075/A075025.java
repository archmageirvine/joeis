package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075025 Numbers k such that d(k) &lt; d(k-1) and d(k) &lt; d(k+1), where d(k) is the number of divisors of k.
 * @author Sean A. Irvine
 */
public class A075025 extends Sequence1 {

  private long mN = 4;

  @Override
  public Z next() {
    while (true) {
      final Z s = Functions.SIGMA0.z(++mN);
      if (s.compareTo(Functions.SIGMA0.z(mN - 1)) < 0 && s.compareTo(Functions.SIGMA0.z(mN + 1)) < 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

