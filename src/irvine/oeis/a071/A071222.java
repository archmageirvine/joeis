package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071147.
 * @author Sean A. Irvine
 */
public class A071222 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    while (true) {
      if (Functions.GCD.l(mN, ++k) == Functions.GCD.l(mN + 1, k + 1)) {
        return Z.valueOf(k);
      }
    }
  }
}
