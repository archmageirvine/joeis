package irvine.oeis.a051;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001414 Integer log of n: sum of primes dividing n (with repetition). Also called sopfr(n).
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
