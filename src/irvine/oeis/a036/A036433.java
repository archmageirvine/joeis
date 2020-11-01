package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036433 Number of divisors is a digit in the base 10 representation of n.
 * @author Sean A. Irvine
 */
public class A036433 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z s0 = Cheetah.factor(++mN).sigma0();
      if (Z.TEN.compareTo(s0) > 0 && String.valueOf(mN).contains(s0.toString())) {
        return Z.valueOf(mN);
      }
    }
  }
}
