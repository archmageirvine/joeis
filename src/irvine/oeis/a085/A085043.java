package irvine.oeis.a085;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A085043 Primes arising in A085042: a(n) = the n-th partial sum of A085042.
 * @author Sean A. Irvine
 */
public class A085043 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.equals(Z.FIVE)) {
      return mSum;
    }
    do {
      mSum = mSum.add(p);
    } while (!mSum.isProbablePrime());
    return mSum;
  }
}
