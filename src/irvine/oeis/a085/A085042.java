package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085042 Smallest multiple of the n-th prime such that every partial sum is a prime, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A085042 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.equals(Z.FIVE)) {
      return Z.ZERO;
    }
    long k = 0;
    do {
      ++k;
      mSum = mSum.add(p);
    } while (!mSum.isProbablePrime());
    return p.multiply(k);
  }
}
