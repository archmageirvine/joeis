package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.math.z.Binomial;
import irvine.math.z.Stirling;

/**
 * A053492 REVEGF transform of [1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, ...].
 * @author Sean A. Irvine
 */
public class A053492 implements Sequence {

  protected int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    Z f = Z.ONE;
    for (int k = 1; k < mN; ++k) {
      f = f.multiply(k);
      s = s.add(f.multiply(Stirling.secondKind(mN - 1, k)).multiply(Binomial.binomial(mN + k - 1, mN - 1)));
    }
    return s;
  }
}
