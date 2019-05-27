package irvine.oeis.a064;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A064135 Number of divisors of <code>10^n + 1</code> that are relatively prime to <code>10^m + 1</code> for all <code>0 &lt; m &lt</code>; n.
 * @author Sean A. Irvine
 */
public class A064135 implements Sequence {

  private int mN = -1;

  protected int base() {
    return 10;
  }

  @Override
  public Z next() {
    long c = 0;
    for (final Z d : Jaguar.factor(Z.valueOf(base()).pow(++mN).add(1)).divisors()) {
      Z t = Z.ONE;
      boolean ok = true;
      for (int k = 1; k < mN; ++k) {
        t = t.multiply(base());
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

