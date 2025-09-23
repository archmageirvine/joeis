package irvine.oeis.a080;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080569 a(n) is the first number in the first run of at least n successive numbers, all having exactly 3 distinct prime factors.
 * @author Sean A. Irvine
 */
public class A080569 extends Sequence1 {

  private long mN = 0;
  private long mM = 30;

  private boolean is(final long m) {
    for (long k = 0; k < mN; ++k) {
      if (Functions.OMEGA.i(m + k) != 3) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    while (!is(mM)) {
      ++mM;
    }
    return Z.valueOf(mM);
  }
}

