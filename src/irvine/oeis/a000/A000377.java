package irvine.oeis.a000;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000377.
 * @author Sean A. Irvine
 */
public class A000377 implements Sequence {

  long mN = -1;

  @Override
  public Z next() {
    Z r = Z.ONE;
    if (++mN > 0) {
      long n = mN;
      while ((n & 1) == 0) {
        n >>= 1;
      }
      while (n % 3 == 0) {
        n /= 3;
      }
      final FactorSequence fs = Cheetah.factor(n);
      for (final Z p : fs.toZArray()) {
        final int e = fs.getExponent(p);
        final long m = p.mod(24);
        if (m < 13) {
          r = r.multiply(e + 1);
        } else if ((e & 1) != 0) {
          return Z.ZERO;
        }
      }
    }
    return r;
  }
}
