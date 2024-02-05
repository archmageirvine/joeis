package irvine.oeis.a046;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;

/**
 * A046523 Smallest number with same prime signature as n.
 * @author Sean A. Irvine
 */
public class A046523 extends Sequence1 implements DirectSequence {

  private long mN = 0;

  @Override
  public Z a(final Z n) {
    return FactorUtils.leastPrimeSignature(n);
  }

  @Override
  public Z a(final int n) {
    return a(Z.valueOf(n));
  }

  @Override
  public Z next() {
    return FactorUtils.leastPrimeSignature(Z.valueOf(++mN));
  }
}

