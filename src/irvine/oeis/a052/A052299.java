package irvine.oeis.a052;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052299 Minimal number of distinct prime factors of any composite number between n-th and (n+1)-st primes.
 * @author Sean A. Irvine
 */
public class A052299 extends A000040 {

  {
    super.next();
  }
  private Z mP = super.next();

  @Override
  public Z next() {
    Z s = mP.add(1);
    mP = super.next();
    int min = Integer.MAX_VALUE;
    while (!s.equals(mP)) {
      min = Integer.min(min, Jaguar.factor(s).omega());
      s = s.add(1);
    }
    return Z.valueOf(min);
  }
}
