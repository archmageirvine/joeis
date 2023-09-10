package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A065750 Smaller term of a pair of twin primes of form (prime(i) - i)*(prime(i) + i) +- 1; the i is from A065749.
 * @author Sean A. Irvine
 */
public class A065750 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final Z p = super.next();
      final Z t = p.subtract(mN).multiply(p.add(mN));
      final Z u = t.subtract(1);
      if (u.isProbablePrime() && t.add(1).isProbablePrime()) {
        return u;
      }
    }
  }
}
