package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001068.
 * @author Sean A. Irvine
 */
public class A001068 implements Sequence {

  private Z mN = Z.valueOf(-5);

  @Override
  public Z next() {
    mN = mN.add(5);
    return mN.shiftRight(2);
  }
}

