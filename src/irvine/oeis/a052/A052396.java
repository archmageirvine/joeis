package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052396 (+2)-sigma perfect numbers: numbers such that (+2)sigma(n)=2*n, where if n=Product p(i)^r(i) then (+2)sigma(n)=Product (2+Sum p(i)^s(i), s(i)=1 to r(i)), e.g. (+2)sigma(6)=(2+2)*(2+3)=20.
 * @author Sean A. Irvine
 */
public class A052396 implements Sequence {

  private Z mN = Z.ONE;

  private Z sigmaPlus2(final Z n) {
    Z prod = Z.ONE;
    final FactorSequence fs = Cheetah.factor(n);
    for (final Z p : fs.toZArray()) {
      final int e = fs.getExponent(p);
      Z sum = Z.TWO;
      Z q = p;
      for (int k = 1; k <= e; ++k, q = q.multiply(p)) {
        sum = sum.add(q);
      }
      prod = prod.multiply(sum);
    }
    return prod;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply2().equals(sigmaPlus2(mN))) {
        return mN;
      }
    }
  }
}
