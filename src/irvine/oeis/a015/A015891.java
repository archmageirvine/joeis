package irvine.oeis.a015;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015891 Numbers k such that <code>k | 5^k + 5</code>.
 * @author Sean A. Irvine
 */
public class A015891 implements Sequence {

  private long mN = 0;
  private Z mT = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mT = mT.multiply(5);
      if (++mN <= 2 || mT.mod(mN) == mN - 5) {
        return Z.valueOf(mN);
      }
    }
  }
}

