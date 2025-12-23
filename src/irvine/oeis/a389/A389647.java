package irvine.oeis.a389;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A389647 allocated for Ilya Gutkovskiy.
 * @author Sean A. Irvine
 */
public class A389647 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z p = super.next();
    ++mN;
    final String s = p.toString();
    Z q = p;
    long k = mN;
    while (true) {
      ++k;
      q = mPrime.nextPrime(q);
      if (q.toString().contains(s)) {
        return Z.valueOf(k);
      }
    }
  }
}

