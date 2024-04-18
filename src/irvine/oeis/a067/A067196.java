package irvine.oeis.a067;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a002.A002321;

/**
 * A067196 Numbers n such that M(n) = Sum_{i=1..n} mu(phi(i)) where M(n) is the Mertens function A002321(n).
 * @author Sean A. Irvine
 */
public class A067196 extends A002321 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      mSum = mSum.add(Functions.MOBIUS.i(Functions.PHI.l(n)));
      if (mSum.equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}

