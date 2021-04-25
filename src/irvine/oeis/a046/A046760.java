package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046760 Wasteful numbers.
 * @author Sean A. Irvine
 */
public class A046760 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final FactorSequence fs = Cheetah.factor(++mN);
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
