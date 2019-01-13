package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005418.
 * @author Sean A. Irvine
 */
public class A005418 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    return Z.ONE.shiftLeft(mN - 2).add(Z.ONE.shiftLeft(mN / 2 - 1));
  }
}
