package irvine.oeis.a079;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A079448 Primes p such that there is at least one integer x satisfying p = x*tau(x)-1 where tau(x) = A000005(x), the number of divisors of x.
 * @author Sean A. Irvine
 */
public class A079448 extends A000040 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      while (mN.compareTo(p) <= 0) {
        mN = mN.add(1);
        final Z t = Functions.SIGMA0.z(mN).multiply(mN).subtract(1);
        if (t.compareTo(p) >= 0 && t.isProbablePrime()) {
          mA.add(t);
        }
      }
      if (mA.first().equals(p)) {
        mA.pollFirst();
        return p;
      }
    }
  }
}
