package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051448 Sum of prime divisors of n (with multiplicity) is a square.
 * @author Sean A. Irvine
 */
public class A051448 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).sopfr().isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
