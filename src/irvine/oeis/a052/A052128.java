package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052128 Largest factor of n that is coprime to a larger factor of n.
 * @author Sean A. Irvine
 */
public class A052128 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    final Z[] d = Cheetah.factor(++mN).divisorsSorted();
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
