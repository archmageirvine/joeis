package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A067264 Numbers n such that prime(n+1)-prime(n)=bigomega(n).
 * @author Sean A. Irvine
 */
public class A067264 extends A000040 {

  private long mN = 0;
  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP;
      mP = super.next();
      if (mP.subtract(t).longValueExact() == Jaguar.factor(++mN).bigOmega()) {
        return Z.valueOf(mN);
      }
    }
  }
}

