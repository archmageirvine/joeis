package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015888 Numbers n such that <code>n | (3^n + 3)</code>.
 * @author Sean A. Irvine
 */
public class A015888 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(3);
      if (++mN <= 4 || mT.mod(mN) == mN - 3) {
        return Z.valueOf(mN);
      }
    }
  }
}

