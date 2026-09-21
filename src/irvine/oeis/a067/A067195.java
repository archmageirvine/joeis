package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A067195 Numbers k such that M(k) = Sum_{i=1..k} mu(sigma(i)) where M(k) is the Mertens function A002321(k).
 * @author Sean A. Irvine
 */
public class A067195 extends A002321 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final long n = Functions.SIGMA1.l(++mN);
      mSum = mSum.add(Functions.MOBIUS.i(n));
      if (mSum.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

