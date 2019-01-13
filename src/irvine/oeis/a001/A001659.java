package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001659.
 * @author Sean A. Irvine
 */
public class A001659 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (long j = 0; j <= mN; ++j) {
      Z t = Z.ZERO;
      for (long k = 1; k <= j; ++k) {
        t = t.add(j / k);
      }
      t = t.multiply(Binomial.binomial(mN, j));
      s = s.signedAdd(((mN - j) & 1) == 0, t);
    }
    return s;
  }
}
