package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082295 Numbers having more than two square divisors &gt; 1.
 * @author Sean A. Irvine
 */
public class A082295 extends Sequence1 {

  private int mN = 35;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    int cnt = 0;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e > 5) {
        return true;
      }
      if (fs.getExponent(p) > 1 && ++cnt > 1) {
        return true;
      }
    }
    return false;
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
