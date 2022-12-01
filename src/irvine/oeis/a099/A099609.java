package irvine.oeis.a099;

import irvine.math.z.Z;
import irvine.oeis.a077.A077800;

/**
 * A099609 Naive list of twin primes (A077800 prefixed by 2, 3).
 * @author Georg Fischer
 */
public class A099609 extends A077800 {

  private int mN = 1;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 3) {
      return Z.valueOf(mN);
    }
    return super.next();
  }
}
