package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007501.
 * @author Sean A. Irvine
 */
public class A007501 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.multiply(mA.add(1)).divide2();
    return mA;
  }
}

