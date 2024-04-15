package irvine.oeis.a063;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A063798 phi(s(n^3)) is a square, where s(n) is sigma(n)-n (A001065).
 * @author Sean A. Irvine
 */
public class A063798 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n3 = mN.pow(3);
      if (Euler.phi(Functions.SIGMA.z(n3).subtract(n3)).isSquare()) {
        return mN;
      }
    }
  }
}
