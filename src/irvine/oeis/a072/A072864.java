package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072864 Numbers n such that the smallest k dividing sigma(k*n^2) is equal to 3.
 * @author Sean A. Irvine
 */
public class A072864 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z ns = mN.square();
      if (Functions.SIGMA1.z(ns.multiply2()).isOdd() && Functions.SIGMA1.z(ns.multiply(3)).mod(3) == 0) {
        return mN;
      }
    }
  }
}
