package irvine.oeis.a028;

import irvine.factor.factor.Cheetah;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028235 If n = Product (p_j^k_j), a(n) = numerator of Sum 1/p_j (the denominator of this sum is A007947).
 * @author Sean A. Irvine
 */
public class A028235 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    Q sum = Q.ZERO;
    for (final Z p : Cheetah.factor(++mN).toZArray()) {
      sum = sum.add(new Q(Z.ONE, p));
    }
    return sum.num();
  }
}
