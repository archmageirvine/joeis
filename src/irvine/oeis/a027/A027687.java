package irvine.oeis.a027;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A027687 4-perfect (quadruply-perfect or sous-triple) numbers: sum of divisors of n is 4n.
 * @author Sean A. Irvine
 */
public class A027687 extends Sequence1 {

  private Z mN = Z.valueOf(30239);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (Functions.SIGMA.z(mN).equals(mN.shiftLeft(2))) {
        return mN;
      }
    }
  }
}
