package irvine.oeis.a109;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A109622.
 * @author Sean A. Irvine
 */
public class A109622 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ONE;
    for (long k = 1; k <= (mN - 1) / 2; ++k) {
      final Z kk = Z.valueOf(k);
      sum = sum.add(kk.multiply(mN).subtract(kk.square()).add(mN + 1));
    }
    if ((mN & 1) == 0) {
      final Z t = Z.valueOf(mN / 2);
      sum = sum.add(t.square().add(t.multiply(3)).add(2).divide(2));
    }
    return sum;
  }
}

