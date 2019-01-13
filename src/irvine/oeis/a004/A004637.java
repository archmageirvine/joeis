package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A004637.
 * @author Sean A. Irvine
 */
public class A004637 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    return new Z(mN.pow(3).toString(7));
  }
}

