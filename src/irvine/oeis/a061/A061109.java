package irvine.oeis.a061;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061109 a(1) = 1; a(n) = smallest number such that the concatenation a(1)a(2)...a(n) is an n-th power.
 * @author Sean A. Irvine
 */
public class A061109 extends Sequence1 {

  // After Robert Israel

  private static final Q ONE_TENTH = new Q(1, 10);
  private Z mC = Z.ONE;
  private int mN = 0;

  static Z f(final int n, final Z x) {
    long d = 0;
    final Q rn = new Q(1, n);
    while (true) {
      final Z tenD = Z.TEN.pow(++d);
      final Z z = CR.valueOf(ONE_TENTH.add(x).multiply(tenD)).pow(rn).ceil();
      final Z zn = z.pow(n);
      if (zn.compareTo(x.add(1).multiply(tenD)) < 0) {
        final Z res = zn.subtract(x.multiply(tenD));
        if (!res.isZero()) {
          return res;
        }
      }
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final Z t = f(mN, mC);
    mC = new Z(mC.toString() + t);
    return t;
  }
}
