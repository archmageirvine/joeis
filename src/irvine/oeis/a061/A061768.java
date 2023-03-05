package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061715.
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
