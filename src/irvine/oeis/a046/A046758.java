package irvine.oeis.a046;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046758 Equidigital numbers.
 * @author Sean A. Irvine
 */
public class A046758 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (++mN == 1) {
        return Z.ONE;
      }
      final FactorSequence fs = Cheetah.factor(mN);
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
      if (l == len) {
        return Z.valueOf(mN);
      }
    }
  }
}
