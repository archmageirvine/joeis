package irvine.oeis.a070;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A070044.
 * @author Sean A. Irvine
 */
public class A070045 extends Sequence1 {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z t = Functions.CEIL_SQRT.z(mN.pow(3));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
