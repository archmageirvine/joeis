package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A024011 Numbers n such that n-th prime divides sum of first n primes.
 * @author Sean A. Irvine
 */
public class A024011 extends A000040 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    Z p;
    do {
      ++mN;
      p = super.next();
      mSum = mSum.add(p);
    } while (!Z.ZERO.equals(mSum.mod(p)));
    return Z.valueOf(mN);
  }
}
