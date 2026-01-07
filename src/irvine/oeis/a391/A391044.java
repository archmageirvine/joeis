package irvine.oeis.a391;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A015921.
 * @author Sean A. Irvine
 */
public class A391044 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final int o1 = Functions.OMEGA.i(++mN);
      if (o1 <= 2) {
        final int o2 = o1 * Functions.OMEGA.i(mN + 1);
        if (o2 <= 2 && o2 * Functions.OMEGA.i(mN + 2) == 2) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
