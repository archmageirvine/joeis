package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045816 Number of times the digits are repeated in A045815.
 * @author Sean A. Irvine
 */
public class A045816 implements Sequence {

  private long mN = 2728;

  @Override
  public Z next() {
    while (true) {
      final int c = A045815.matchingCount(Cheetah.factor(++mN).divisors(), 6);
      if (c > 0) {
        return Z.valueOf(c);
      }
    }
  }
}
