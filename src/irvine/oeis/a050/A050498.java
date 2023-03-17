package irvine.oeis.a050;

import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A050498 Arithmetic progressions of at least 4 terms with common difference 6 having the same value of phi(x) start at these numbers.
 * @author Sean A. Irvine
 */
public class A050498 extends Sequence1 {

  // It is likely these are all = 0 (mod 6),
  // but we try evey value here

  private Z mN = Z.valueOf(71);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z phi = Euler.phi(mN);
      if (phi.equals(Euler.phi(mN.add(6))) && phi.equals(Euler.phi(mN.add(12))) && phi.equals(Euler.phi(mN.add(18)))) {
        return mN;
      }
    }
  }
}
