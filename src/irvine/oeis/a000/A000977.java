package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000977 Numbers that are divisible by at least three different primes.
 * @author Sean A. Irvine
 */
public class A000977 implements Sequence {

  private long mN = 29;

  @Override
  public Z next() {
    while (Cheetah.factor(++mN).toZArray().length < 3) {
    }
    return Z.valueOf(mN);
  }
}
