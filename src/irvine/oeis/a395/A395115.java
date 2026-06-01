package irvine.oeis.a395;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395115 Smallest integer m &gt; 1 such that gcd(m^(3*n) - 1, m! - 1) &gt; 1.
 * @author Sean A. Irvine
 */
public class A395115 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      if (!Functions.GCD.z(Z.valueOf(++k).pow(3 * mN).subtract(1), Functions.FACTORIAL.z(k).subtract(1)).isOne()) {
        return Z.valueOf(k);
      }
    }
  }
}
