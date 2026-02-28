package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A392504 Smallest prime\u202fp, distinct from prime(n), that uses exactly the same set of digits as prime(n), and -1 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A392504 extends A000040 {

  private static final Z Z11 = Z.valueOf(11);

  @Override
  public Z next() {
    final Z p = super.next();
    if (p.compareTo(Z.TEN) < 0) {
      return Z.NEG_ONE;
    }
    final int syn = Functions.SYNDROME.i(p);
    // Special case repunit
    if (syn == 2) {
      return p.equals(Z11) ? Z.valueOf(1111111111111111111L) : Z11;
    }
    long q = 7;
    while (true) {
      q = mPrime.nextPrime(q);
      if (Functions.SYNDROME.i(q) == syn && !p.equals(q)) {
        return Z.valueOf(q);
      }
    }
  }
}
