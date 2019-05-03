package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015892 Numbers k such that k <code>| 6^k + 6</code>.
 * @author Sean A. Irvine
 */
public class A015892 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(6);
      if (++mN <= 3 || mT.mod(mN) == mN - 6) {
        return Z.valueOf(mN);
      }
    }
  }
}

