package irvine.oeis.a061;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
 * @author Sean A. Irvine
 */
public class A061715 extends Sequence1 {

  private long mN = 3;

  private boolean is(final long n) {
    final FactorSequence fm = Jaguar.factor(n - 1);
    final FactorSequence fp = Jaguar.factor(n + 1);
    if (fm.omega() != fp.omega()) {
      return false;
    }
    final Z[] m = fm.toZArray();
    final Z[] p = fp.toZArray();
    for (int k = 0; k < m.length; ++k) {
      if (fm.getExponent(m[k]) != fp.getExponent(p[k])) {
        return false;
      }
    }
    return true;
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
