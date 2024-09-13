package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072188 Numbers k that divide sigma(k-1)+sigma(k)+sigma(k+1), where sigma() is the "sum of integer divisors" function.
 * @author Sean A. Irvine
 */
public class A072188 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      final Z s = Functions.SIGMA.z(mN++).add(Functions.SIGMA.z(mN)).add(Functions.SIGMA.z(mN + 1));
      if (s.mod(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
