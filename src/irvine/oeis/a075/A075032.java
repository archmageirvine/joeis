package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075032 Numbers n such that tau(n) &lt;= tau(n+1) &lt;= tau(n+2) where tau(n) = number of divisors of n.
 * @author Sean A. Irvine
 */
public class A075032 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s1 = Functions.SIGMA0.z(++mN + 1);
      if (Functions.SIGMA0.z(mN).compareTo(s1) <= 0 && s1.compareTo(Functions.SIGMA0.z(mN + 2)) <= 0) {
        return Z.valueOf(mN);
      }
    }
  }
}

