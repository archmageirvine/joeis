package irvine.oeis.a050;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050498 Arithmetic progressions of at least 4 terms with common difference 6 having the same value of phi(x) start at these numbers.
 * @author Sean A. Irvine
 */
public class A050498 implements Sequence {

  // It is likely these are all = 0 (mod 6),
  // but we try evey value here

  private Z mN = Z.valueOf(71);

  private Z phi(final Z n) {
    //return Euler.phi(n);
    return Cheetah.factor(n).phi();
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z phi = phi(mN);
      if (phi.equals(phi(mN.add(6))) && phi.equals(phi(mN.add(12))) && phi.equals(phi(mN.add(18)))) {
        return mN;
      }
    }
  }
}
