package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066708 Least m such that n = m mod tau(m) if such m exists, otherwise 0.
 * @author Sean A. Irvine
 */
public class A066708 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long m = ++mN;
    while (true) {
      final long s = Functions.SIGMA0.l(m);
      if (mN == m % s) {
        return Z.valueOf(m);
      }
      ++m;
    }
  }
}
