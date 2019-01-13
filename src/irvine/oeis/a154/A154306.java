package irvine.oeis.a154;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A154306.
 * @author Sean A. Irvine
 */
public class A154306 implements Sequence {

  private int mN = 0;
  private Z mF = Z.TWO;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN + 2);
    return Z.valueOf(mN).pow(3).multiply(mF).divide(6);
  }
}

