package irvine.oeis.a034;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A034414 Leading term in extremal weight enumerator of doubly-even binary self-dual code of length 24n.
 * @author Sean A. Irvine
 */
public class A034414 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    return Binomial.binomial(5 * mN - 2, mN - 1)
      .multiply(6 * mN - 1)
      .multiply(8 * mN - 1)
      .multiply(12 * mN - 1)
      .multiply(24 * mN - 1)
      .multiply(18)
      .divide(mN + 1)
      .divide(2 * mN + 1)
      .divide(4 * mN + 1)
      .divide(4 * mN + 3);
  }
}

