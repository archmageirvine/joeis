package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A061466 Product of primes prime(3*n+1), prime(3*n+2), prime(3*n+3).
 * @author Sean A. Irvine
 */
public class A061466 extends A000040 {

  {
    setOffset(0);
  }

  @Override
  public Z next() {
    return super.next().multiply(super.next()).multiply(super.next());
  }
}

