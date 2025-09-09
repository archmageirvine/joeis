package irvine.oeis.a387;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A387096 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A387096 extends Sequence1 {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.compareTo(Functions.PRIMORIAL_COUNT.z(Functions.BIG_OMEGA.l(mN))) < 0) {
        return mN;
      }
    }
  }
}

