package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067734 Number of ways writing n as a product of decimal digits of some other number which has no digits equal to 1.
 * @author Sean A. Irvine
 */
public class A067734 extends Sequence1 {

  // After Max Alekseyev

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final Z[] p = fs.toZArray();
    if (p[p.length - 1].compareTo(Z.SEVEN) > 0) {
      return Z.ZERO;
    }
    final int[] v = {fs.getExponent(Z.TWO), fs.getExponent(Z.THREE), fs.getExponent(Z.FIVE), fs.getExponent(Z.SEVEN)};
    Z r = Z.ZERO;
    for (int i6 = 0; i6 <= Math.min(v[0], v[1]); ++i6) {
      for (int i8 = 0; i8 <= (v[0] - i6) / 3; ++i8) {
        for (int i4 = 0; i4 <= (v[0] - i6 - 3 * i8) / 2; ++i4) {
          final int i2 = v[0] - i6 - 3 * i8 - 2 * i4;
          for (int i9 = 0; i9 <= (v[1] - i6) / 2; ++i9) {
            final int i3 = v[1] - i6 - 2 * i9;
            r = r.add(Binomial.multinomial(i2 + i3 + i4 + v[2] + i6 + v[3] + i8 + i9, i2, i3, i4, v[2], i6, v[3], i8, i9));
          }
        }
      }
    }
    return r;
  }
}
