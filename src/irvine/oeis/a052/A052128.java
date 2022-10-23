package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A052128 a(1) = 1; for n &gt; 1, a(n) is the largest divisor of n that is coprime to a larger divisor of n.
 * @author Sean A. Irvine
 */
public class A052128 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(++mN).divisorsSorted();
    for (int k = d.length - 1; k >= 0; --k) {
      for (int j = k + 1; j < d.length; ++j) {
        if (d[k].gcd(d[j]).equals(Z.ONE)) {
          return d[k];
        }
      }
    }
    return Z.ONE;
  }
}
