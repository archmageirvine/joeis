package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076000 a(n) = Product_{k=1..n} k/floor(n/k).
 * @author Georg Fischer
 */
public class A076000 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(new Q(k, Z.valueOf(mN).divide(k)));
    }
    return prod.toZ();
  }
}
