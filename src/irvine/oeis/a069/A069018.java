package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069018 Smallest square k &gt; 0 such that n*k + 1 is also a square or 0 if no such term exists, i.e., when n is a square.
 * @author Sean A. Irvine
 */
public class A069018 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (LongUtils.isSquare(++mN)) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    long k = 0;
    while (true) {
      if (n.multiply(++k * k).add(1).isSquare()) {
        return Z.valueOf(k * k);
      }
    }
  }
}

