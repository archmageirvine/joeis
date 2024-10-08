package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A072162 (Prime(n)+prime(n+1)+prime(n+2))/(n+1) is an integer; sequence gives prime(n).
 * @author Sean A. Irvine
 */
public class A072162 extends A000040 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      final Z q = mPrime.nextPrime(p);
      if (p.add(q).add(mPrime.nextPrime(q)).mod(++mN) == 0) {
        return p;
      }
    }
  }
}
