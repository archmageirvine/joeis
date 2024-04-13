package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058995 Numbers m such that 13^m reversed is prime.
 * @author Sean A. Irvine
 */
public class A058995 extends Sequence1 {

  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(13);
      if (Functions.REVERSE.z(mA).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
