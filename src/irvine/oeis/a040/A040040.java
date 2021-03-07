package irvine.oeis.a040;

import irvine.math.z.Z;
import irvine.oeis.a014.A014574;

/**
 * A040040 Average of twin prime pairs (A014574), divided by 2. Equivalently, 2*a(n)-1 and 2*a(n)+1 are primes.
 * @author Sean A. Irvine
 */
public class A040040 extends A014574 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
