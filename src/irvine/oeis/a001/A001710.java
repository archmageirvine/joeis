package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001710 Order of alternating group A_n, or number of even permutations of n letters.
 * @author Sean A. Irvine
 */
public class A001710 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    mA = mA.multiply(mN);
    return mA;
  }

}
