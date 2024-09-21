package irvine.oeis.a072;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072287 Let f(n, m) = binomial(n - m/2 + 1, n - m + 1) - binomial(n - m/2, n - m + 1) and let s(n) = Sum_{k=0..n} f(n, k); then a(n) = numerator of s(n).
 * @author Sean A. Irvine
 */
public class A072287 extends Sequence0 {

  private Q mA = null;
  private Q mB = null;
  private int mN = 0;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Q.ONE;
        return Z.ONE;
      }
      mB = Q.TWO;
      return Z.TWO;
    }
    final Q t = mA.add(mB).add(Binomial.binomial(new Q(2L * ++mN - 1, 2), mN));
    mA = mB;
    mB = t;
    return t.num();
  }
}
