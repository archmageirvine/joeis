package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392668 Numbers m such that sigma(m) = 2*m - omega(m), where omega(m) is the number of distinct prime divisors of m.
 * @author Sean A. Irvine
 */
public class A392668 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).equals(2 * mN - Functions.OMEGA.i(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
