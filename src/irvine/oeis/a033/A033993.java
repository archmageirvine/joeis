package irvine.oeis.a033;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A033993 Numbers that are divisible by exactly four different primes.
 * @author Sean A. Irvine
 */
public class A033993 implements Sequence {

  private long mN = 209;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).omega() == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
