package irvine.oeis.a185;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A185617 Least m for which A185615(n) divides A000201(A185615(n))^m.
 * @author Sean A. Irvine
 */
public class A185617 extends A000201 {

  @Override
  public Z next() {
    while (true) {
      final Z v = super.next();
      if (v.mod(mN) == 0) {
        return Z.ONE;
      }
      final FactorSequence fs = Jaguar.factor(mN);
      int max = 0;
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        if (e > max) {
          max = e;
        }
      }
      if (v.pow(max).mod(mN) == 0) {
        Z u = v;
        int m = 1;
        while (true) {
          ++m;
          u = u.multiply(v);
          if (u.mod(mN) == 0) {
            return Z.valueOf(m);
          }
        }
      }
    }
  }
}
