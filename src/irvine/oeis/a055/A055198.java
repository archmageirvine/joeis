package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A055198 Numbers n with property that n cycles to itself after sufficiently many iterations of "reverse decimal digits of (n+4)".
 * @author Sean A. Irvine
 */
public class A055198 extends Sequence1 {

  private static final long HEURISTIC_LIMIT = 1000;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      Z m = mN;
      for (long k = 0; k < HEURISTIC_LIMIT; ++k) {
//        if (mN.equals(Z.valueOf(1011))) {
//          System.out.println(k + " " + m);
//        }
        m = Functions.REVERSE.z(m.add(4));
        if (m.equals(mN)) {
          return mN;
        }
      }
    }
  }
}
