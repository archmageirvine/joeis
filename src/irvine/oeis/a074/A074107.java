package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000040;

/**
 * A074107 a(n) = Product of (prime + 1) for first n primes - primorial (n); Sum of proper divisors of the n-th primorial.
 * @author Sean A. Irvine
 */
public class A074107 extends Sequence0 {

  private final Sequence mP = new A000040();
  private Z mA = null;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      final Z p = mP.next();
      mA = mA.multiply(p.add(1));
      mB = mB.multiply(p);
    }
    return mA.subtract(mB);
  }
}
