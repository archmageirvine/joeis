package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070993 Numbers n such that the trajectory of n under the "3x+1" map reaches n+1.
 * @author Sean A. Irvine
 */
public class A070993 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z n1 = mN.add(1);
      Z t = mN;
      while (!t.equals(Z.ONE)) {
        t = t.isEven() ? t.divide2() : t.multiply(3).add(1);
        if (t.equals(n1)) {
          return mN;
        }
      }
    }
  }
}
