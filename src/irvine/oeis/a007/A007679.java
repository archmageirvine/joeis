package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007679.
 * @author Sean A. Irvine
 */
public class A007679 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN).add((1 - (++mN & 1)) * (1 - (mN & 2)));
  }
}
