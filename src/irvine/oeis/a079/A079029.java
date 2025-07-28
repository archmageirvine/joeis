package irvine.oeis.a079;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079029 Least k such that the class number of quadratic order of discriminant D=-4k equals p, where p runs through the primes.
 * @author Sean A. Irvine
 */
public class A079029 extends A000040 {

  @Override
  public Z next() {
    final long p = super.next().longValueExact();
    long k = 0;
    while (true) {
      if (LongUtils.classNumber(-4 * ++k) == p) {
        return Z.valueOf(k);
      }
    }
  }
}
