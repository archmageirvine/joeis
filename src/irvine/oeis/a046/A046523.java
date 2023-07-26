package irvine.oeis.a046;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046523 Smallest number with same prime signature as n.
 * @author Sean A. Irvine
 */
public class A046523 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    return FactorUtils.leastPrimeSignature(Z.valueOf(++mN));
  }
}

