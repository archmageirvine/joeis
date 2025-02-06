package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075035 Numbers n such that tau(n) &gt;= tau(n+1) &gt;= tau(n+2) &gt;= tau(n+3) where tau(n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A075035 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s1 = Functions.SIGMA0.z(++mN + 1);
      final Z s2 = Functions.SIGMA0.z(mN + 2);
      if (s1.compareTo(s2) >= 0 && Functions.SIGMA0.z(mN).compareTo(s1) >= 0 && s2.compareTo(Functions.SIGMA0.z(mN + 3)) >= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

