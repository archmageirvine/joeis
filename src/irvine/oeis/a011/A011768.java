package irvine.oeis.a011;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.nt.mobius.Mobius;
import irvine.oeis.Sequence;

/**
 * A011768.
 * @author Sean A. Irvine
 */
public class A011768 implements Sequence {

  // After N. J. A. Sloane

  private int mN = 0;

  private Z a(final int n, final int d) {
    if (d % 3 == 0) {
      return Z.ONE.shiftLeft(n / d);
    } else {
      return Z.ONE.shiftLeft(n / d).signedAdd(((n / d) & 1) == 0, Z.TWO).divide(3);
    }
  }

  private Z e(final int n) {
    if ((n & 1) == 0) {
      Z sum = Z.valueOf(n).shiftLeft(n / 2);
      for (int d = 1; d <= n / 2; ++d) {
        if ((n / 2) % d == 0) {
          sum = sum.add(Z.valueOf(LongUtils.phi(2L * d)).shiftLeft(n / 2 / d));
        }
      }
      return sum;
    } else {
      return Z.ONE.shiftLeft((n + 1) / 2).signedAdd(((n + 1) & 1) == 0, Z.TWO).multiply(n).divide(3);
    }
  }

  private Z[] pp(final int n) {
    final Z[] t = new Z[n + 1];
    for (int k = 1; k <= n; ++k) {
      Z sum = Z.ZERO;
      for (int d = 1; d <= k; ++d) {
        if (k % d == 0) {
          sum = sum.add(a(k, d).multiply(LongUtils.phi(d)));
        }
      }
      t[k] = sum.add(e(k)).divide(4 * k);
    }
    return t;
  }

  @Override
  public Z next() {
    final Z[] t1 = pp(++mN);
    Z sum = Z.ZERO;
    for (int d = 1; d <= mN; ++d) {
      if (mN % d == 0) {
        sum = sum.add(t1[d].multiply(Mobius.mobius(mN / d)));
      }
    }
    return sum;
  }
}
