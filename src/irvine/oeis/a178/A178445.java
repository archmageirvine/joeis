package irvine.oeis.a178;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A178445 a(n) = prime(n)^2 mod n^2.
 * @author Georg Fischer
 */
public class A178445 extends A000040 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().square().mod(Z.valueOf((long) mN * mN));
  }
}
