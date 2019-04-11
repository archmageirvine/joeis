package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005015 <code>11*2^n</code>.
 * @author Sean A. Irvine
 */
public class A005015 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : mA.multiply2();
    return mA;
  }

}

