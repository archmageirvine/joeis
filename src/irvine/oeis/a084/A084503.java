package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A084503 Binary juggling state vectors (given in decimal), associated with the three balls juggling sequence A084501.
 * @author Sean A. Irvine
 */
public class A084503 extends Sequence0 {

  private final Sequence mS = new A084501();
  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.SEVEN;
    } else {
      mA = mA.add(Z.ONE.shiftLeft(mS.next().longValueExact()).subtract(1)).divide2();
    }
    return mA;
  }
}
