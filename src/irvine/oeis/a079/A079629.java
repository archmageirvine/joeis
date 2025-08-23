package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a001.A001359;

/**
 * A079618.
 * @author Sean A. Irvine
 */
public class A079629 extends A001359 {

  @Override
  public Z next() {
    final Z p = super.next();
    final Z q2 = mPrime.nextPrime(p).square();
    Z r = p.square();
    long cnt = 0;
    while ((r = mPrime.nextPrime(r).add(2)).compareTo(q2) < 0) {
      if (r.isProbablePrime()) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}

