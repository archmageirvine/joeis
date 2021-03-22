package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045810 Number of times the digits are repeated in A045799.
 * @author Sean A. Irvine
 */
public class A045810 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      long ones = 0;
      long total = 0;
      for (final Z d : Cheetah.factor(++mN).divisors()) {
        ones += d.bitCount();
        total += d.bitLength();
      }
      if (2 * ones == total) {
        return Z.valueOf(ones);
      }
    }
  }
}

