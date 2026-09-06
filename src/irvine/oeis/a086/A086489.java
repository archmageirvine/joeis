package irvine.oeis.a086;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086489 Smallest k such that k and k + n have the same prime signature.
 * @author Sean A. Irvine
 */
public class A086489 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (FactorUtils.leastPrimeSignature(++k).equals(FactorUtils.leastPrimeSignature(mN + k))) {
        return Z.valueOf(k);
      }
    }
  }
}

