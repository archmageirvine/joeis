package irvine.oeis.a090;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A090050 Numbers having equal length of longest contiguous block of zeros and ones in binary expansion.
 * @author Georg Fischer
 */
public class A090050 implements Sequence {

  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (A090000.maxBitLength(mN, 1) != A090000.maxBitLength(mN, 0)) {
      mN = mN.add(1);
    }
    return mN;
  }
}
