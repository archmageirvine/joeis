package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001969 Evil numbers: numbers with an even number of <code>1</code>'s in their binary expansion.
 * @author Sean A. Irvine
 */
public class A001969 implements Sequence {

  private Z mN = Z.NEG_ONE;

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if ((mN.bitCount() & 1) == 0) {
        return mN;
      }
    }
  }
}
