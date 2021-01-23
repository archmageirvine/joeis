package irvine.oeis.a106;

import irvine.math.z.Z;

/**
 * A106275 Numbers n for which the absolute value of the discriminant of the polynomial x^n - x^(n-1) -...- x - 1 is a prime times 2^k for some k &gt;=0.
 * @author Sean A. Irvine
 */
public class A106275 extends A106273 {

  @Override
  public Z next() {
    while (!super.next().abs().makeOdd().isProbablePrime(10)) {
    }
    return Z.valueOf(mN);
  }
}

