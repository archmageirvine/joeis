package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053188.
 * @author Sean A. Irvine
 */
public class A075036 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    mN += 2;
    long k = 1;
    while (true) {
      if (Functions.SIGMA0.z(++k).equals(mN) && Functions.SIGMA0.z(k + 1).equals(mN)) {
        return Z.valueOf(k);
      }
    }
  }
}

