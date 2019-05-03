package irvine.oeis.a014;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014613 Numbers that are products of 4 primes (these numbers are sometimes called <code>"4-almost</code> primes", a generalization of <code>semiprimes)</code>.
 * @author Sean A. Irvine
 */
public class A014613 implements Sequence {

  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      if (Cheetah.factor(++mN).bigOmega() == 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
