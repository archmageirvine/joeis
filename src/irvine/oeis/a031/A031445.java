package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031445 n-th number k which in base 2 has 2 more <code>0</code>'s than <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A031445 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.bitCount() * 2 == mN.bitLength() - 2) {
        return mN;
      }
    }
  }
}
