package irvine.oeis.a084;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;

/**
 * A084513 Juggling states associated with the juggling sequence A084511.
 * @author Sean A. Irvine
 */
public class A084513 extends Sequence0 {

  private final Sequence mS = new A084511();
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
