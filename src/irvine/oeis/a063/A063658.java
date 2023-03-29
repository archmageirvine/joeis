package irvine.oeis.a063;

import irvine.math.z.Z;

/**
 * A063658 The number of integers m in [1..n] for which gcd(m,n) is divisible by a square greater than 1.
 * @author Georg Fischer
 */
public class A063658 extends A063659 {

  private long mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(++mN).subtract(super.next());
  }
}
