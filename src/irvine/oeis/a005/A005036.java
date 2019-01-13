package irvine.oeis.a005;

import irvine.factor.factor.Cheetah;
import irvine.math.LongUtils;
import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005036.
 * @author Sean A. Irvine
 */
public class A005036 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Q a = new Q(Binomial.binomial(3 * mN , mN), Z.valueOf(2 * mN + 1).multiply(2 * mN + 2));
    if ((mN & 1) == 1) {
      a = a.add(new Q(Binomial.binomial((3 * mN - 1) / 2, (mN - 1) / 2), Z.valueOf(2 * mN + 2)).multiply(5));
    } else {
      a = a.add(new Q(Binomial.binomial(3 * mN / 2, mN / 2), Z.valueOf(2 * mN + 2)).multiply(3));
    }
    final long d = LongUtils.gcd(4, mN - 1);
    for (final Z s : Cheetah.factor(d).divisors()) {
      final long ss = s.longValueExact();
      if (ss > 2) {
        a = a.add(new Q(Binomial.binomial((3 * mN + 1) / ss, (mN - 1) / ss), Z.valueOf(3 * mN + 1)).multiply(LongUtils.phi(ss)));
      }
    }
    return a.toZ().divide2();
  }
}
