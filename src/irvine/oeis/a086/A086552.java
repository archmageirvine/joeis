package irvine.oeis.a086;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086552 Numbers x such that tau(x)/tau(x-1) is an integer, where tau() is the number of divisors function.
 * @author Sean A. Irvine
 */
public class A086552 extends Sequence1 {

  private long mN = 1;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      final Z u = mT;
      mT = Functions.SIGMA0.z(++mN);
      if (mT.mod(u).isZero()) {
        return Z.valueOf(mN);
      }
    }
  }
}
