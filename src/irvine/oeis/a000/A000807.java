package irvine.oeis.a000;

import irvine.math.z.BellNumbers;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000807.
 * @author Sean A. Irvine
 */
public class A000807 implements Sequence {

  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      final Z t = Binomial.binomial(mN, k).multiply(BellNumbers.bell(k)).multiply(BellNumbers.bell(mN - k));
      s = s.signedAdd((k & 1) == 0, t);
    }
    return s;
  }
}

