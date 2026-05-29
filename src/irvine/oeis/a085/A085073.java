package irvine.oeis.a085;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A085073 Smallest k such that n+k and n*k have the same prime signature, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085073 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      ++k;
      if (FactorUtils.leastPrimeSignature(mN + k).equals(FactorUtils.leastPrimeSignature(mN * k))) {
        return Z.valueOf(k);
      }
    }
  }
}

