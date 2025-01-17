package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A074240 Numbers k such that k-th prime = sigma(sigma(k)) + 1.
 * @author Sean A. Irvine
 */
public class A074240 extends A000040 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(Functions.SIGMA1.z(++mN)).add(1).equals(super.next())) {
        return Z.valueOf(mN);
      }
    }
  }
}
