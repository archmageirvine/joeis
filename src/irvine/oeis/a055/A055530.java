package irvine.oeis.a055;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A055530 The recurrence b(k) = 10*b(k-1) + k^n with b(0)=0 has b(k)/10^k converging to a(n)/9^(n+1).
 * @author Sean A. Irvine
 */
public class A055530 implements Sequence {

  private int mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(9);
    Q sum = Q.ZERO;
    long x = 0;
    Z den = Z.ONE;
    while (true) {
      den = den.multiply(10);
      final Q t = new Q(Z.valueOf(++x).pow(mN).multiply(mA), den);
      sum = sum.add(t);
      if (t.compareTo(Q.HALF) < 0) {
        break;
      }
    }
    return sum.ceiling();
  }
}
