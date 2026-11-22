package irvine.oeis.a289;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A289900 Number of maximal matchings in the n-triangular honeycomb rook graph.
 * @author Gregory Morse
 */
public class A289900 extends Sequence1 {
  private int mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    mA = mA.multiply(Functions.MULTIFACTORIAL.z(2, ++mN - ((mN & 1) == 0 ? 1 : 0)));
    return mA;
  }
}
