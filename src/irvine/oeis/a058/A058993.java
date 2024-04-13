package irvine.oeis.a058;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A058993 Numbers m such that 5^m reversed is a prime.
 * @author Sean A. Irvine
 */
public class A058993 extends Sequence1 {

  private Z mA = Z.ONE;
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mA = mA.multiply(5);
      if (Functions.REVERSE.z(mA).isProbablePrime()) {
        return Z.valueOf(mN);
      }
    }
  }
}
