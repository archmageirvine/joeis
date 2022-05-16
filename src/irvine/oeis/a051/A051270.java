package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051270 Numbers that are divisible by exactly 5 different primes.
 * @author Sean A. Irvine
 */
public class A051270 implements Sequence {

  private long mN = 209;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).omega() == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
