package irvine.oeis.a043;

import irvine.math.z.Z;
import irvine.oeis.a017.A017665;

/**
 * A043305 Numbers k such that the numerator of the sum of the reciprocals of the divisors of k (=A017665(k)) is a power of 2.
 * @author Sean A. Irvine
 */
public class A043305 extends A017665 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (super.next().bitCount() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}

