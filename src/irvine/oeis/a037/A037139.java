package irvine.oeis.a037;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037139 Deficient numbers k such that k-s(k)-s(k-s(k)) = s(s(k))-s(k) or s(k-s(k))-k+s(k) = s(k)-s(s(k)).
 * @author Sean A. Irvine
 */
public class A037139 extends Sequence1 {

  private Z mN = Z.valueOf(122);

  private Z s(final Z n) {
    return Functions.SIGMA.z(n.abs()).subtract(n);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z s = s(mN);
      if (s.compareTo(mN) < 0) {
        final Z t = mN.subtract(s).subtract(s(mN.subtract(s)));
        final Z z = s(s).subtract(s);
        if (t.equals(z)) {
          return mN;
        }
      }
    }
  }
}
