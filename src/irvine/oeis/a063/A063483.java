package irvine.oeis.a063;

import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a002.A002808;
import irvine.oeis.Sequence0;

/**
 * A063483 S[A002808(n)] where S[] is Boris Stechkin's function (A055004) and A002808(n) are the composites.
 * @author Sean A. Irvine
 */
public class A063483 extends Sequence0 {

  private int mFirst = -1;
  private final A002808 mSeq = new A002808();

  @Override
  public Z next() {
    if (mFirst < 1) {
      ++mFirst;
      return Z.ZERO;
    }
    final int n = mSeq.next().intValueExact();
    return Integers.SINGLETON.sum(2, n, k -> Z.valueOf(k - 1).multiply(n * (long) (k - 1) / k));
  }
}
