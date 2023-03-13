package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061888 Numbers k such that k^2 is the sum of the first m primes for some m.
 * @author Sean A. Irvine
 */
public class A061888 extends A061890 {

  @Override
  public Z next() {
    return super.next().sqrt();
  }
}
