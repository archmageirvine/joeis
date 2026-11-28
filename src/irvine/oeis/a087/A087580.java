package irvine.oeis.a087;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a000.A000045;

/**
 * A087580 Primes with n-th successive differences a multiple of Fibonacci(n+1). a(n)-a(n-1) == 0 (mod F(n+1)), F(n+1) = A000045(n+1).
 * @author Sean A. Irvine
 */
public class A087580 extends Sequence0 {

  private Z mA = null;
  private final Sequence mF = new A000045().skip(2);

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.TWO;
      return mA;
    }
    final Z mod = mF.next();
    do {
      mA = mA.add(mod);
    } while (!mA.isProbablePrime());
    return mA;
  }
}

