package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072140.
 * @author Sean A. Irvine
 */
public class A072215 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : Functions.PARTITIONS.z(mA);
    return mA;
  }
}
