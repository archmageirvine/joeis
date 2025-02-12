package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075169.
 * @author Sean A. Irvine
 */
public class A075244 extends Sequence1 {

  private long mN = 0;

  private boolean isOk(final long k) {
    for (long base = 2; base < mN; ++base) {
      if (Functions.REVERSE.z(base, k).isProbablePrime()) {
        // Already prime in a smaller base
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    long k = mN;
    while (true) {
      if (Functions.REVERSE.z(mN, ++k).isProbablePrime() && isOk(k)) {
        return Z.valueOf(k);
      }
    }
  }
}
