package irvine.oeis.a081;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A081991 Numbers in ascending order formed by using all the digits of the next n numbers.
 * @author Sean A. Irvine
 */
public class A081991 extends Sequence1 {

  private Permutation mPerm = Permutation.permuter(Z.ONE);
  private int mN = 1;
  private int mM = 1;

  @Override
  public Z next() {
    while (true) {
      final int[] p = mPerm.next();
      if (p == null) {
        ++mN;
        final StringBuilder sb = new StringBuilder();
        for (int k = 0; k < mN; ++k) {
          sb.append(++mM);
        }
        mPerm = Permutation.permuter(new Z(sb));
      } else if (p[0] != 0) {
        return Permutation.permToZ(p);
      }
    }
  }
}
