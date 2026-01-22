package irvine.oeis.a392;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A068869.
 * @author Sean A. Irvine
 */
public class A392626 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Z n = Z.valueOf(++mN);
    long k = 0;
    while (true) {
      if (Functions.OMEGA.i(n.multiply(++k)) == Functions.OMEGA.i(mN + k)) {
        return Z.valueOf(k);
      }
    }
  }
}
