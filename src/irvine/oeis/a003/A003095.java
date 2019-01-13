package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003095.
 * @author Sean A. Irvine
 */
public class A003095 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.square().add(1);
    return mA;
  }
}
