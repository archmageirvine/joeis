package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A066513 Numbers n such that f(n) = f(n-1) - f(n-2) where f is the prime gap function given by f(m) = prime(m+1) - prime(m) and prime(m) denotes the m-th prime.
 * @author Sean A. Irvine
 */
public class A066513 extends A001223 {

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
      if (mA.subtract(t).equals(mB)) {
        return Z.valueOf(mN);
      }
    }
  }
}
