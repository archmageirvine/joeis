package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A084487 Prime(n)+q, where q is the next prime such that q mod 4 = prime(n) mod 4.
 * @author Sean A. Irvine
 */
public class A084487 extends Sequence2 {

  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = Functions.NEXT_PRIME.z(mP);
    final long r = mP.mod(4);
    Z q = mP;
    while (true) {
      q = Functions.NEXT_PRIME.z(q);
      if (q.mod(4) == r) {
        return q.add(mP);
      }
    }
  }
}
