package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A066495 Numbers k such that f(k) = f(k-1) + f(k-2) where f denotes the prime gaps function given by f(m) = prime(m+1) - prime(m).
 * @author Sean A. Irvine
 */
public class A066495 extends A001223 {

  private long mN = 2;
  private Z mA = super.next();
  private Z mB = super.next();

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z t = mA;
      mA = mB;
      mB = super.next();
      if (t.add(mA).equals(mB)) {
        return Z.valueOf(mN);
      }
    }
  }
}
