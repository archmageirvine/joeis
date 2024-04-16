package irvine.oeis.a052;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A052299 Minimal number of distinct prime factors of any composite number between n-th and (n+1)-st primes.
 * @author Sean A. Irvine
 */
public class A052299 extends A000040 {

  {
    setOffset(2);
    super.next();
  }
  private Z mP = super.next();

  @Override
  public Z next() {
    Z s = mP.add(1);
    mP = super.next();
    int min = Integer.MAX_VALUE;
    while (!s.equals(mP)) {
      min = Integer.min(min, Functions.OMEGA.i(s));
      s = s.add(1);
    }
    return Z.valueOf(min);
  }
}
