package irvine.oeis.a066;

import irvine.math.z.Z;
import irvine.oeis.a001.A001223;

/**
 * A066515 Numbers k such that prime(k+1) + prime(k-2) = 2*prime(k-1), where prime(m) is the m-th prime.
 * @author Sean A. Irvine
 */
public class A066515 extends A001223 {

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
      if (t.subtract(mA).equals(mB)) {
        return Z.valueOf(mN);
      }
    }
  }
}
