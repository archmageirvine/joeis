package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006586.
 * @author Sean A. Irvine
 */
public class A006586 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long m = 2 * mN - 1;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(m / (2 * k + 1));
    }
    return sum;
  }
}
