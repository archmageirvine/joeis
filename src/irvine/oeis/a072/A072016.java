package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071115.
 * @author Sean A. Irvine
 */
public class A072016 extends Sequence1 {

  private static final Z C = Z.valueOf(27);
  private Z mA = Z.ZERO;

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
