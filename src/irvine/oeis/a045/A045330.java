package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045330 Lesser of the smallest pair of consecutive numbers divisible by an n-th power, but not both divisible by an (n+1)-st power.
 * @author Sean A. Irvine
 */
public class A045330 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 1L << mN;
    while (true) {
      final int e = Cheetah.factor(k).maxExponent();
      if (e >= mN) {
        final int f = Cheetah.factor(k + 1).maxExponent();
        if (f >= mN && (e == mN || f == mN)) {
          return Z.valueOf(k);
        }
      }
      ++k;
    }
  }
}
