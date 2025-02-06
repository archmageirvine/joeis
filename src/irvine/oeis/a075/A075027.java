package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075027 Numbers k such that d(k-1) &lt; d(k) &gt; d(k+1), d = A000005.
 * @author Sean A. Irvine
 */
public class A075027 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final Z s = Functions.SIGMA0.z(++mN);
      if (s.compareTo(Functions.SIGMA0.z(mN - 1)) > 0 && s.compareTo(Functions.SIGMA0.z(mN + 1)) > 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

