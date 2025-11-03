package irvine.oeis.a390;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390108 allocated for Davide Oliveri.
 * @author Sean A. Irvine
 */
public class A390108 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1 || mN == 5) {
      return Z.ZERO;
    }
    final long p = Functions.PRIME.l(mN);
    Z b = Z.ONE;
    while (true) {
      b = b.add(1);
      Z s = Z.ZERO;
      for (long k = 1; k <= mN; ++k) {
        s = s.add(b.pow(p - Functions.PRIME.l(k)));
      }
      if (s.isProbablePrime()) {
        return b;
      }
    }
  }
}
