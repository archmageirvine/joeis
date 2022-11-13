package irvine.oeis.a060;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A060376 If 10^n can be written as x*y where the digits of x and y are all nonzero, then let a(n) = smallest such x, otherwise a(n) = -1.
 * @author Sean A. Irvine
 */
public class A060376 extends Sequence0 {

  private FactorSequence mA = null;

  private boolean isZeroFree(final Z d) {
    return ZUtils.digitCounts(d)[0] == 0;
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = new FactorSequence();
      return Z.ONE;
    } else {
      mA.add(2, FactorSequence.PRIME);
      mA.add(5, FactorSequence.PRIME);
    }
    final Z n = mA.product();
    for (final Z d : mA.divisorsSorted()) {
      if (d.square().compareTo(n) > 0) {
        return Z.NEG_ONE;
      }
      if (isZeroFree(d) && isZeroFree(n.divide(d))) {
        return d;
      }
    }
    throw new RuntimeException();
  }
}
