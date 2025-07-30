package irvine.oeis.a079;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079081 Numerator of (prime(n)+1)*(prime(n+1)+1)/(4*(prime(n)*prime(n+1)+1)).
 * @author Sean A. Irvine
 */
public class A079081 extends A000040 {

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    return select(new Q(p.add(1).multiply(q.add(1)).divide(4), p.multiply(q).add(1)));
  }
}
