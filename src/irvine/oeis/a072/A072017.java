package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072017 extends Sequence0 {

  private static final Z C = Z.valueOf(81);
  private Z mA = Z.valueOf(2899999908L);

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(C);
      final Z r = Functions.REVERSE.z(mA);
      if (r.mod(C).isZero() && Functions.GCD.z(mA, r).equals(C)) {
        return mA;
      }
    }
  }
}
