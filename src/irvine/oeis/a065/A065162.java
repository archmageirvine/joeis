package irvine.oeis.a065;

import java.util.Arrays;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * A065162 Least common multiple of all orbit sizes (cycle lengths in corresponding permutations A065181-A065184) into which the Foata transform partitions the symmetric group Sn.
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
    final int old = mP.length;
    mF *= mN;
    mP = Arrays.copyOf(mP, mF);
    for (int k = old; k < mP.length; ++k) {
      mP[k] = super.next().intValueExact();
    }
    return IntegerPermutation.lcmCycleSizes(mP);
  }
}
