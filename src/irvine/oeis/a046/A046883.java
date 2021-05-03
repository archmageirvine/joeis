package irvine.oeis.a046;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A046883 Automorphic primes: primes p such that p is k-th prime and p ends in k.
 * @author Sean A. Irvine
 */
public class A046883 extends A000040 {

  private long mN = 0;
  private long mMod = 10;

  @Override
  public Z next() {
    while (true) {
      if (++mN == mMod) {
        mMod *= 10;
      }
      final Z p = super.next();
      if (p.mod(mMod) == mN) {
        return p;
      }
    }
  }
}
