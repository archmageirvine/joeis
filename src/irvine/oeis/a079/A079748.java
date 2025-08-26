package irvine.oeis.a079;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079748 Largest k such that the greatest prime factors from n to n+k are monotonically increasing.
 * @author Sean A. Irvine
 */
public class A079748 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long gpf = Functions.GPF.l(++mN);
    long k = 0;
    while (true) {
      final long g = Functions.GPF.l(mN + ++k);
      if (g <= gpf) {
        return Z.valueOf(k - 1);
      }
      gpf = g;
    }
  }
}

