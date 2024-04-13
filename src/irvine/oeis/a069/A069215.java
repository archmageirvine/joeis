package irvine.oeis.a069;

import irvine.math.function.Functions;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A069211.
 * @author Sean A. Irvine
 */
public class A069215 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Euler.phiAsLong(++mN) == Functions.REVERSE.l(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

