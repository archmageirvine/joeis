package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045818 Number of times the digits are repeated in <code>A045817</code>.
 * @author Sean A. Irvine
 */
public class A045818 implements Sequence {

  private long mN = 1324;

  @Override
  public Z next() {
    while (true) {
      final int c = A045815.matchingCount(Cheetah.factor(++mN).divisors(), 7);
      if (c > 0) {
        return Z.valueOf(c);
      }
    }
  }
}
