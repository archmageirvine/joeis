package irvine.oeis.a034;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034916 31752-hyperperfect numbers: n = 31752*(sigma(n)-n-1) + 1.
 * @author Sean A. Irvine
 */
public class A034916 implements Sequence {

  private long mN = 4660241040L;

  @Override
  public Z next() {
    while (true) {
      final long sigma = Jaguar.factor(++mN).sigma().longValueExact();
      final long s = sigma - mN - 1;
      if (31752 * s == mN - 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
