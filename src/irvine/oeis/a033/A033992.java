package irvine.oeis.a033;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033992 Numbers that are divisible by exactly three different primes.
 * @author Sean A. Irvine
 */
public class A033992 implements Sequence {

  private long mN = 29;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).omega() == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
