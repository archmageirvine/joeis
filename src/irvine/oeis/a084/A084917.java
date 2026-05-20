package irvine.oeis.a084;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084917 Positive numbers of the form 3*y^2 - x^2.
 * @author Sean A. Irvine
 */
public class A084917 extends Sequence1 {

  private long mN = 1;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    long cnt = 0;
    for (final Z p : fs.toZArray()) {
      final long r = p.mod(12);
      if (r == 2 || r == 3 || r == 11) {
        cnt += fs.getExponent(p);
      }
      if ((r == 5 || r == 7) && (fs.getExponent(p) & 1) == 1) {
        return false;
      }
    }
    return (cnt & 1) == 1;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
