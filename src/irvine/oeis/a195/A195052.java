package irvine.oeis.a195;
// manually sigman0/sigma0 at 2023-02-28 16:08

import irvine.math.z.Z;

/**
 * A195052 Number of divisors of 24*n - 1 divided by 2.
 * @author Georg Fischer
 */
public class A195052 extends A195051 {

  @Override
  public Z next() {
    return super.next().divide2();
  }
}
