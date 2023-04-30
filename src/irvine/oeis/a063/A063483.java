package irvine.oeis.a063;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;

/**
 * A063483 S[A002808(n)] where S[] is Boris Stechkin's function (A055004) and A002808(n) are the composites.
 * @author Sean A. Irvine
 */
public class A063483 extends A002808 {

  private int mFirst = -1;

  @Override
  public Z next() {
    if (mFirst < 1) {
      ++mFirst;
      return Z.ZERO;
    }
    final int n = super.next().intValueExact();
    return Integers.SINGLETON.sum(2, n, k -> Z.valueOf(k - 1).multiply(n * (long) (k - 1) / k));
  }
}
