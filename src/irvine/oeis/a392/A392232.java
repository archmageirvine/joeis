package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392232 Numbers k for which omega(k)*omega(k + 1)*omega(k + 2)*omega(k + 3)*omega(k + 4) = 4 where omega = A001221.
 * @author Sean A. Irvine
 */
public class A392232 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final int o1 = Functions.OMEGA.i(++mN);
      if (o1 <= 4) {
        final int o2 = o1 * Functions.OMEGA.i(mN + 1);
        if (o2 <= 4) {
          final int o3 = o2 * Functions.OMEGA.i(mN + 2);
          if (o3 <= 4) {
            final int o4 = o3 * Functions.OMEGA.i(mN + 3);
            if (o4 <= 4 && o4 * Functions.OMEGA.i(mN + 4) == 4) {
              return Z.valueOf(mN);
            }
          }
        }
      }
    }
  }
}
