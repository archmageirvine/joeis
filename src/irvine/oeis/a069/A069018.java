package irvine.oeis.a069;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069003.
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

