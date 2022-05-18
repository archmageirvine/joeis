package irvine.oeis.a037;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A037139 Deficient numbers n such that n-s(n)-s(n-s(n)) = s(s(n))-s(n) or s(n-s(n))-n+s(n) = s(n)-s(s(n)).
 * @author Sean A. Irvine
 */
public class A037139 implements Sequence {

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
