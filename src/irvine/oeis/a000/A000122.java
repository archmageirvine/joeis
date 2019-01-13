package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000122.
 * @author Sean A. Irvine
 */
public class A000122 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.equals(Z.ZERO)) {
      return Z.ONE;
    }
    if (mN.sqrtAndRemainder()[1].equals(Z.ZERO)) {
      return Z.TWO;
    }
    return Z.ZERO;
  }
}

