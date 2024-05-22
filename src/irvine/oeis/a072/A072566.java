package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072566 Numbers n such that n and sigma(n) end with the same digit in base 10.
 * @author Sean A. Irvine
 */
public class A072566 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).mod(10) == (mN % 10)) {
        return Z.valueOf(mN);
      }
    }
  }
}
