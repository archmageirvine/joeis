package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069035 Smallest proper multiple of n with digit sum n.
 * @author Sean A. Irvine
 */
public class A069035 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (true) {
      m += mN;
      if (Functions.DIGIT_SUM.l(m) == mN) {
        return Z.valueOf(m);
      }
    }
  }
}

