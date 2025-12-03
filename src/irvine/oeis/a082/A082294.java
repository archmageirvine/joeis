package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082294 Numbers having exactly two square divisors &gt; 1.
 * @author Sean A. Irvine
 */
public class A082294 extends Sequence1 {

  private int mN = 15;

  private boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    boolean ok = false;
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      if (e == 4 || e == 5) {
        ok = true;
      } else if (e != 1) {
        return false;
      }
    }
    return ok;
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
