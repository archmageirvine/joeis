package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079083 Smallest odd prime factor of (prime(n)+1)*(prime(n+1)+1)/4.
 * @author Sean A. Irvine
 */
public class A079083 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q = mPrime.nextPrime(p);
    return Functions.LPF.z(p.add(1).multiply(q.add(1)).makeOdd());
  }
}
