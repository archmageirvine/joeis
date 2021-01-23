package irvine.oeis.a015;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015791 a(n) is the smallest integer k such that phi(k) + n | sigma(k + n).
 * @author Sean A. Irvine
 */
public class A015791 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final Z phi = Cheetah.factor(++k).phi().add(mN);
      final Z sigma = Cheetah.factor(k + mN).sigma();
      if (sigma.mod(phi).isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
