package irvine.oeis.a048;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A048593 Converse numbers: composite Fibonacci numbers Fib(n) that are congruent to Legendre symbol (n/5) mod n.
 * @author Sean A. Irvine
 */
public class A048593 extends A000045 {

  {
    // Skip units
    super.next();
    super.next();
    super.next();
  }
  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z f = super.next();
      final long r = f.mod(mN);
      if (r == LongUtils.jacobi(mN, 5) && !f.isProbablePrime()) {
        return f;
      }
    }
  }
}

