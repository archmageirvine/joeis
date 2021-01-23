package irvine.oeis.a036;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036966 3-full (or cube-full, or cubefull) numbers: if a prime p divides n then so does p^3.
 * @author Sean A. Irvine
 */
public class A036966 implements Sequence {

  private long mN = 0;

  protected int minExponent() {
    return 3;
  }

  private boolean is(final long n) {
    if (n == 1) {
      return true;
    }
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z p : fs.toZArray()) {
      if (fs.getExponent(p) < minExponent()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (!is(++mN)) {
      // do nothing
    }
    return Z.valueOf(mN);
  }
}
