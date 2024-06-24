package irvine.oeis.a070;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070165.
 * @author Sean A. Irvine
 */
public class A070991 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z n1 = mN;
      mN = mN.add(1);
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
