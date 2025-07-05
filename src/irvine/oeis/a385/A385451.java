package irvine.oeis.a385;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A078523.
 * @author Sean A. Irvine
 */
public class A385451 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.ANTISIGMA1.z(++k).equals(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}
