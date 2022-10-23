package irvine.oeis.a046;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046760 Wasteful numbers.
 * @author Sean A. Irvine
 */
public class A046760 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Jaguar.factor(++mN);
      final int len = String.valueOf(mN).length();
      int l = 0;
      for (final Z p : fs.toZArray()) {
        l += p.toString().length();
        final int e = fs.getExponent(p);
        if (e > 1) {
          l += String.valueOf(e).length();
        }
        if (l > len) {
          break;
        }
      }
      if (l > len) {
        return Z.valueOf(mN);
      }
    }
  }
}
