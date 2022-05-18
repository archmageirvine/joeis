package irvine.oeis.a185;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A185615 Numbers k that divide A000201(k)^m for some integer m &gt; 0, where A000201 is the lower Wythoff sequence.
 * @author Sean A. Irvine
 */
public class A185615 extends A000201 {

  @Override
  public Z next() {
    while (true) {
      final Z v = super.next();
      if (v.mod(mN) == 0) {
        return Z.valueOf(mN);
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
        return Z.valueOf(mN);
      }
    }
  }
}
