package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A064035.
 * @author Sean A. Irvine
 */
public class A064135 implements Sequence {

  private int mN = -1;

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Jaguar.factor(Z.TEN.pow(++mN).add(1)).divisors()) {
      Z t = Z.ONE;
      boolean ok = true;
      for (int k = 1; k < mN; ++k) {
        t = t.multiply(10);
        if (!Z.ONE.equals(t.add(1).gcd(d))) {
          ok = false;
          break;
        }
      }
      if (ok) {
        ++c;
      }
    }
    return Z.valueOf(c);
  }
}

