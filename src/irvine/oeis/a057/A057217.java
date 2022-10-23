package irvine.oeis.a057;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057217 a(n) = smallest positive integer k such that 1+n*k! is a prime.
 * @author Sean A. Irvine
 */
public class A057217 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    Z f = Z.valueOf(++mN);
    long k = 1;
    while (true) {
      if (f.add(1).isProbablePrime()) {
        return Z.valueOf(k);
      }
      f = f.multiply(++k);
    }
  }
}
