package irvine.oeis.a307;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A307980.
 * @author Sean A. Irvine
 */
public class A307980 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long len = String.valueOf(++mN).length();
      if (Cheetah.factor(mN).sigma0AsLong() == len * len) {
        return Z.valueOf(mN);
      }
    }
  }
}
