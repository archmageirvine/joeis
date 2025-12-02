package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082260 a(n) = n-th multiple of n with digit sum n.
 * @author Sean A. Irvine
 */
public class A082260 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long r = 0;
    for (long m = 0; m < mN; ++m) {
      do {
        r += mN;
      } while (Functions.DIGIT_SUM.l(r) != mN);
    }
    return Z.valueOf(r);
  }
}
