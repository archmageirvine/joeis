package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002117 Decimal expansion of <code>zeta(3) = Sum_{m &gt;= 1} 1/m^3</code>.
 * @author Sean A. Irvine
 */
public class A002117 implements Sequence {

  private Q mF10 = Q.ONE;
  private Q mA = Q.ZERO;
  private Q mB = add(Q.ZERO, 0);
  private Z mMul = Z.ONE;
  private int mK = 0;

  private Q add(final Q s, final int k) {
    final Z kk = Z.valueOf(k);
    if (k > 0) {
      mF10 = mF10.multiply(new Q(kk.pow(10), Z.valueOf(2L * k).multiply(2L * k + 1).pow(5)));
    }
    final Z n = kk.multiply(205).add(250).multiply(k).add(77);
    final Q t = mF10.multiply(n).divide(64);
    if ((k & 1) == 0) {
      return s.add(t);
    } else {
      return s.subtract(t);
    }
  }


  @Override
  public Z next() {
    while (true) {
      final long a = mA.multiply(mMul).toZ().mod(10);
      final long b = mB.multiply(mMul).toZ().mod(10);
      if (a == b) {
        mMul = mMul.multiply(10);
        return Z.valueOf(a);
      }
      mA = mB;
      mB = add(mB, ++mK);
    }
  }
}
