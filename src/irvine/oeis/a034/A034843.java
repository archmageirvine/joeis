package irvine.oeis.a034;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034843 Number of divisors = first digit.
 * @author Sean A. Irvine
 */
public class A034843 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sigma0().longValueExact() == String.valueOf(mN).charAt(0) - '0') {
        return Z.valueOf(mN);
      }
    }
  }
}
