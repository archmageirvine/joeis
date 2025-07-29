package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079060 Least k such that the least positive primitive root of prime(k) equals prime(n).
 * @author Sean A. Irvine
 */
public class A079060 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z p = super.next();
    long k = mN;
    Z q = p;
    while (true) {
      ++k;
      q = mPrime.nextPrime(q);
      if (Functions.LEAST_PRIMITIVE_ROOT.z(q).equals(p)) {
        return Z.valueOf(k);
      }
    }
  }
}

