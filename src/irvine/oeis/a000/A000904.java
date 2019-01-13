package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000904.
 * @author Sean A. Irvine
 */
public class A000904 implements Sequence {

  private long mN = 1;
  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;
  private Z mC = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    final Z t = mC.multiply(mN).add(mB.multiply(mN + 1)).add(mA);
    mA = mB;
    mB = mC;
    mC = t;
    return t;
  }
}

