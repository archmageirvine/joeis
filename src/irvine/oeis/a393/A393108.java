package irvine.oeis.a393;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393108 allocated for Juri-Stepan Gerasimov.
 * @author Sean A. Irvine
 */
public class A393108 extends Sequence1 {

  private long mN = 3;

  @Override
  public Z next() {
    while (true) {
      final int o1 = Functions.OMEGA.i(++mN);
      if (o1 <= 4) {
        final int o2 = o1 * Functions.OMEGA.i(mN + 1);
        if (o2 <= 4) {
          final int o3 = o2 * Functions.OMEGA.i(mN + 2);
          if (o3 <= 4 && o3 * Functions.OMEGA.i(mN + 3) == 4) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
