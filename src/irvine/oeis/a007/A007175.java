package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007175.
 * @author Sean A. Irvine
 */
public class A007175 implements Sequence {

  // After Robert A. Russell

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q a = new Q(Binomial.binomial(4 * mN, mN), Z.valueOf(3 * mN + 1).multiply(3 * mN + 2).multiply(12));
    if ((mN & 1) == 0) {
      a = a.add(new Q(Binomial.binomial(2 * mN, mN / 2), Z.valueOf(3 * mN / 2 + 1).multiply(8)))
        .add(new Q(Binomial.binomial(2 * mN - 1, mN / 2 - 1), Z.valueOf(3 * mN / 2 + 1)));
    } else {
      a = a.add(new Q(Binomial.binomial(2 * mN - 1, (mN - 1) / 2), Z.valueOf(3 * mN + 1)));
    }
    final long r = mN % 3;
    switch ((int) r) {
      case 0:
        a = a.add(new Q(Binomial.binomial(4 * mN / 3, mN / 3), Z.valueOf(3 * (mN + 1))));
        break;
      case 1:
        a = a.add(new Q(Binomial.binomial((4 * mN - 1) / 3, (mN - 1) / 3).multiply2(), Z.valueOf(3 * (mN + 1))));
        break;
      default: // 2
        a = a.add(new Q(Binomial.binomial((4 * mN - 2) / 3, (mN - 2) / 3), Z.valueOf(mN + 1)));
        break;
    }
    if ((mN & 3) == 2) {
      a = a.add(new Q(Binomial.binomial(mN - 1, (mN - 2) / 4), Z.valueOf(3 * mN / 2 + 1)));
    }
    if (mN % 5 == 1) {
      a = a.add(new Q(Binomial.binomial(4 * (mN - 1) / 5, (mN - 1) / 5).multiply2(), Z.valueOf(3 * mN + 2)));
    }
    return a.toZ();
  }
}
