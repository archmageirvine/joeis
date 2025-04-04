package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A076428 Numbers k such that the sum of digits of k in superfactorial base divides k.
 * @author Sean A. Irvine
 */
public class A076428 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final Z m = Z.valueOf(++mN);
      final Z sum = Functions.SUM.z(ZUtils.superfactorialBaseList(m));
      if (m.mod(sum).isZero()) {
        return m;
      }
    }
  }
}
