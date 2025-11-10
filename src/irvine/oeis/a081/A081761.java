package irvine.oeis.a081;

import java.util.Arrays;

import irvine.factor.util.FactorUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081761 Least number &gt;n having same type of prime factorization, a(1)=1.
 * @author Sean A. Irvine
 */
public class A081761 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final int[] sig = FactorUtils.sortedPrimeSignature(Z.valueOf(mN));
    long k = mN;
    while (true) {
      final int[] s = FactorUtils.sortedPrimeSignature(Z.valueOf(++k));
      if (Arrays.equals(sig, s)) {
        return Z.valueOf(k);
      }
    }
  }
}

