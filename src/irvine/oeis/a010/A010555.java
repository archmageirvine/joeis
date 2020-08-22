package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;

/**
 * A010555 a(n) = 1 if n is the product of an even number of distinct primes, otherwise a(n) = -1.
 * @author Sean A. Irvine
 */
public class A010555 extends A008683 {

  @Override
  public Z next() {
    return super.next().signum() > 0 ? Z.ONE : Z.NEG_ONE;
  }
}

