package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005010.
 * @author Sean A. Irvine
 */
public class A005010 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.NINE : mA.multiply2();
    return mA;
  }

}

