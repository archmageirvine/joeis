package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046884 Doubly automorphic primes: p is k-th prime, ends in k and k is itself prime.
 * @author Sean A. Irvine
 */
public class A046884 extends A000040 {

  private long mN = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      final Z p = super.next();
      if (p.mod(mMod) == mN && Z.valueOf(mN).isProbablePrime()) {
        return p;
      }
    }
  }
}
