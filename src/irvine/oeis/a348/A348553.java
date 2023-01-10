package irvine.oeis.a348;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A348553 Number of digits in 11^n.
 * @author Georg Fischer
 */
public class A348553 extends Sequence0 {

  private static final Z ELEVEN = Z.valueOf(11);
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    final Z result = Z.valueOf(mA.toString().length());
    mA = mA.multiply(ELEVEN);
    return result;
  }
}
