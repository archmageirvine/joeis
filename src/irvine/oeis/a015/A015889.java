package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015889 Numbers n such that <code>n | 4^n + 4</code>.
 * @author Sean A. Irvine
 */
public class A015889 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.shiftLeft(2);
      if (++mN <= 2 || mT.mod(mN) == mN - 4) {
        return Z.valueOf(mN);
      }
    }
  }
}

