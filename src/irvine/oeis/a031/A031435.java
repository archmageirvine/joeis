package irvine.oeis.a031;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031435 Reversal point for powers of consecutive natural numbers.
 * @author Sean A. Irvine
 */
public class A031435 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    final Q a = Q.ONE.add(new Q(Z.ONE, mN));
    Q b = a;
    int k = 1;
    while (b.toZ().compareTo(mN) < 0) {
      ++k;
      b = b.multiply(a);
    }
    return Z.valueOf(k);
  }
}
