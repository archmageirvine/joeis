package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.a019.A019518;

/**
 * A091762 Last n digits of concatenation of first n primes.
 * @author Georg Fischer
 */
public class A091762 extends A019518 {

  private Z mTen = Z.ONE;

  @Override
  public Z next() {
    // a(n) = A019518(n) mod 10^n;
    mTen = mTen.multiply(10);
    return super.next().mod(mTen);
  }
}
