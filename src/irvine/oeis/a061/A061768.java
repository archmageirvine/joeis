package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061768 k is the least number such that k! is divisible by (k+1)^n.
 * @author Sean A. Irvine
 */
public class A061768 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      final Z m = Z.valueOf(++k + 1).pow(mN);
      Z f = Z.ONE;
      for (long j = 2; j <= k; ++j) {
        f = f.modMultiply(j, m);
      }
      if (f.isZero()) {
        return Z.valueOf(k);
      }
    }
  }
}
