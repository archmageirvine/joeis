package irvine.oeis.a106;

import irvine.math.z.Z;

/**
 * A106275 Numbers n for which the absolute value of the discriminant of the polynomial <code>x^n - x^(n-1) -...- x - 1</code> is a prime times <code>2^k</code> for some <code>k &gt;=0</code>.
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

