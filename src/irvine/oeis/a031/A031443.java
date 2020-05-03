package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031443 Digitally balanced numbers: numbers that in base 2 have the same number of <code>0</code>'s as <code>1</code>'s.
 * @author Sean A. Irvine
 */
public class A031443 implements Sequence {

  private Z mN = Z.ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.bitCount() * 2 == mN.bitLength()) {
        return mN;
      }
    }
  }
}
