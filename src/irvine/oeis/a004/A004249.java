package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004249.
 * @author Sean A. Irvine
 */
public class A004249 implements Sequence {

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    mA = Z.ONE.shiftLeft(mA.intValueExact());
    return mA.add(1);
  }
}
