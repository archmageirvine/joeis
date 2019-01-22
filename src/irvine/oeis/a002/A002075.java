package irvine.oeis.a002;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.math.Mobius;
import irvine.oeis.Sequence;

/**
 * A002075.
 * @author Sean A. Irvine
 */
public class A002075 implements Sequence {

  private int mN = 0;

  private int hprime(final int d) {
    switch (d % 6) {
    case 0:
      return -6;
    case 3:
      return -3;
    case 1:
    case 5:
      return 1;
    default:
      return -2;
    }
  }

  private int h(final int n) {
    if (n == 1) {
      return 1;
    } else if ((n & (n - 1)) == 0) {
      return -1;
    } else {
      return 0;
    }
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (final Z dd : Cheetah.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int mu = Mobius.mobius(d);
      if (mu != 0) {
        final Z t = Z.THREE.pow(mN / d).multiply(hprime(d) * mu);
        s = s.add(t);
      }
    }
    s = s.divide(3);
    s = s.add(h(mN));
    return s.divide(2 * mN);
  }
}
