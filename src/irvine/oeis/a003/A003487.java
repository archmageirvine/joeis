package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003487.
 * @author Sean A. Irvine
 */
public class A003487 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.square().subtract(2);
    return mA;
  }
}

