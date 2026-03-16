package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393805 Numbers k for which omega(k)*omega(k + 2)*omega(k + 4)*omega(k + 6)*omega(k + 8) = 2 where omega = A001221.
 * @author Sean A. Irvine
 */
public class A393805 extends Sequence1 {

  private long mN = 5;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final int o1 = Functions.OMEGA.i(mN);
      if (o1 <= 2) {
        final int o2 = o1 * Functions.OMEGA.i(mN + 2);
        if (o2 <= 2) {
          final int o3 = o2 * Functions.OMEGA.i(mN + 4);
          if (o3 <= 2) {
            final int o4 = o3 * Functions.OMEGA.i(mN + 6);
            if (o4 <= 2 && o4 * Functions.OMEGA.i(mN + 8) == 2) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
