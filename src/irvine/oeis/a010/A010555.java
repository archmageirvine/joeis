package irvine.oeis.a010;

import irvine.math.z.Z;
import irvine.oeis.a008.A008683;

/**
 * A010555 <code>a(n) = 1</code> if n is the product of <code>an</code> even number of distinct primes, otherwise <code>a(n) = -1</code>.
 * @author Sean A. Irvine
 */
public class A010555 extends A008683 {

  @Override
  public Z next() {
    return super.next().signum() > 0 ? Z.ONE : Z.NEG_ONE;
  }
}

