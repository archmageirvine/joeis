package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070994 Numbers k such that the trajectory of k under the 3x+1 map reaches phi(k).
 * @author Sean A. Irvine
 */
public class A070994 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z phi = Functions.PHI.z(mN);
      Z t = mN;
      while (!t.equals(Z.ONE)) {
        t = t.isEven() ? t.divide2() : t.multiply(3).add(1);
        if (t.equals(phi)) {
          return mN;
        }
      }
    }
  }
}
