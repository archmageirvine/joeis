package irvine.oeis.a059;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059401.
 * @author Sean A. Irvine
 */
public class A059401 implements Sequence {

  private long mN = 1196;

  protected boolean is(final long n) {
    final FactorSequence fs = Jaguar.factor(n);
    if (fs.omega() <= 1) {
      return false;
    }
    final String s = String.valueOf(n);
    for (final Z p : fs.toZArray()) {
      if (!s.contains(p.pow(fs.getExponent(p)).toString())) {
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
