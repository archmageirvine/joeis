package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A076000 a(n) = Product_{k=1..n} k/floor(n/k).
 * @author Georg Fischer
 */
public class A076000 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(new Q(Z.valueOf(k), Z.valueOf(mN).divide(k)));
    }
    return prod.toZ();
  }
}
