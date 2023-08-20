package irvine.oeis.a065;

import java.util.Arrays;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * A055089 List of all finite permutations in reversed colexicographic ordering.
 * @author Sean A. Irvine
 */
public class A065162 extends A065181 {

  private int mF = 1;
  private int mN = 0;
  private int[] mP = {};

  @Override
  public Z next() {
    if (++mN >= 13) {
      // 13! exceeds int array
      throw new UnsupportedOperationException();
    }
    int old = mP.length;
    mF *= mN;
    mP = Arrays.copyOf(mP, mF);
    for (int k = old; k < mP.length; ++k) {
      mP[k] = super.next().intValueExact();
    }
    return IntegerPermutation.lcmCycleSizes(mP);
  }
}
