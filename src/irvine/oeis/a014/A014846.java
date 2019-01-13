package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014846.
 * @author Sean A. Irvine
 */
public class A014846 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.ONE.shiftLeft(mN++).subtract(mN * (long) (mN + 1) / 2);
  }
}
