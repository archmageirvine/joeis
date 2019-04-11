package irvine.oeis.a106;

import irvine.math.z.Z;

/**
 * A106274 Numbers n for which the absolute value of the discriminant of the polynomial <code>x^n - x^(n-1) -...- x - 1</code> is prime.
 * @author Sean A. Irvine
 */
public class A106274 extends A106273 {

  @Override
  public Z next() {
    while (!super.next().abs().isProbablePrime(10)) {
    }
    return Z.valueOf(mN);
  }
}

