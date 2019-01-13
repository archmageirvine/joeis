package irvine.oeis.a185;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.a000.A000201;

/**
 * A185616.
 * @author Sean A. Irvine
 */
public class A185616 extends A000201 {

  @Override
  public Z next() {
    while (true) {
      final Z v = super.next();
      if (v.mod(mN) == 0) {
        return v;
      }
      final FactorSequence fs = Cheetah.factor(mN);
      int max = 0;
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        if (e > max) {
          max = e;
        }
      }
      if (v.pow(max).mod(mN) == 0) {
        return v;
      }
    }
  }
}
