package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070955 Numbers k such that k concatenated with k-1 0's and its reversal is prime.
 * @author Sean A. Irvine
 */
public class A070955 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      final int r = Functions.REVERSE.i(++mN);
      if ((r & 1) == 1) {
        final Z t = new Z(mN + "0".repeat(mN - 1) + r);
        if (t.isProbablePrime()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
