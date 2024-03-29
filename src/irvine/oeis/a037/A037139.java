package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A037139 Deficient numbers k such that k-s(k)-s(k-s(k)) = s(s(k))-s(k) or s(k-s(k))-k+s(k) = s(k)-s(s(k)).
 * @author Sean A. Irvine
 */
public class A037139 extends Sequence0 {

  private Z mN = Z.valueOf(99);

  private Z s(final Z n) {
    return Jaguar.factor(n.abs()).sigma().subtract(n);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = s(mN);
      final Z t = mN.subtract(s).subtract(s(mN.subtract(s)));
      final Z z = s(s).subtract(s);
      if (t.equals(z)) {
        return mN;
      }
    }
  }
}
