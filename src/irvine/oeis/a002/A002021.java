package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002021.
 * @author Sean A. Irvine
 */
public class A002021 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return (++mN & 1) == 0
      ? Z.valueOf(mN).pow(mN).subtract(1).multiply(mN - 1)
      : Z.valueOf(mN).pow(mN).subtract(mN - 1);
  }
}
