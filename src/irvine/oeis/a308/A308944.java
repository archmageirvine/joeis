package irvine.oeis.a308;
// manually prodsim/prodsi at 2021-11-18 23:07

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A308944 a(n) = Product_{k=1..n} lcm(n,k) / (k * gcd(n,k)).
 * @author Georg Fischer
 */
public class A308944 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Q prod = Q.ONE;
    for (int k = 1; k <= mN; ++k) {
      prod = prod.multiply(new Q(Z.valueOf(mN).lcm(Z.valueOf(k)), Z.valueOf(mN).gcd(Z.valueOf(k)).multiply(k)));
    }
    return prod.toZ();
  }
}
