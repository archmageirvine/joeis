package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052298 Maximal number of distinct prime factors of any composite number between n-th and (n+1)-st primes.
 * @author Sean A. Irvine
 */
public class A052298 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    Z s = mP.add(1);
    mP = super.next();
    int max = 0;
    while (!s.equals(mP)) {
      max = Integer.max(max, Cheetah.factor(s).omega());
      s = s.add(1);
    }
    return Z.valueOf(max);
  }
}
