package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082059 Numbers k such that k, sigma(k) and phi(k) have the same decimal digits.
 * @author Sean A. Irvine
 */
public class A082059 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int syn = Functions.SYNDROME.i(++mN);
      if (syn == Functions.SYNDROME.i(Functions.PHI.l(mN)) && syn == Functions.SYNDROME.i(Functions.SIGMA1.z(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
