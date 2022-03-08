package irvine.oeis.a055;

import irvine.math.z.Z;
import irvine.oeis.a054.A054986;

/**
 * A055018 Numbers n such that n and n+1 are modest (cf. A054986).
 * @author Sean A. Irvine
 */
public class A055018 extends A054986 {

  private Z mA = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = super.next();
      if (t.add(1).equals(mA)) {
        return t;
      }
    }
  }
}
