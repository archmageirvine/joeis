package irvine.oeis.a028;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028350.
 * @author Sean A. Irvine
 */
public class A028350 implements Sequence {

  private long mN = -2;
  private Z mA = Z.NEG_ONE;
  
  @Override
  public Z next() {
    if (++mN >= 0) {
     mA = mA.multiply(6 * mN + 1).multiply(6 * mN - 1).multiply(6).divide(mN + 1).divide(2 * mN + 1);
    }
    return mA;
  }
}

