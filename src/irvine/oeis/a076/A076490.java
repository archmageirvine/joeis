package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076490 Number of common (distinct) digits of consecutive prime numbers.
 * @author Sean A. Irvine
 */
public class A076490 extends A000040 {

  @Override
  public Z next() {
    final Z p = super.next();
    return Z.valueOf(Integer.bitCount(Functions.SYNDROME.i(p) & Functions.SYNDROME.i(mPrime.nextPrime(p))));
  }
}
