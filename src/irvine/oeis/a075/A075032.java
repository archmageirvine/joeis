package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075032 Numbers k such that tau(k) &lt;= tau(k+1) &lt;= tau(k+2) where tau(k) = number of divisors of k.
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

