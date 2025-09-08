package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a052.A052248;

/**
 * A080189 a(n) = k such that f^k(prime(n)) = 2, where f is the mapping of primes &gt; 2 to primes defined by A052248.
 * @author Sean A. Irvine
 */
public class A080189 extends A000040 {

  private final DirectSequence mF = DirectSequence.forceCreate(2, new A052248());

  @Override
  public Z next() {
    Z p = super.next();
    long cnt = 0;
    while (!Z.TWO.equals(p)) {
      p = mF.a(Functions.PRIME_PI.i(p));
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}

