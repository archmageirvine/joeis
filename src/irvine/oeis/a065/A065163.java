package irvine.oeis.a065;

import java.util.Arrays;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;

/**
 * A065163 Maximal orbit size in the symmetric group partitioned by the upper records version of the Foata transform (i.e., a(n) is the maximum cycle length found in the corresponding permutations A065181-A065184 in range [0, n!-1]).
 * @author Sean A. Irvine
 */
public class A065163 extends A065181 {

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
    return Z.valueOf(IntegerPermutation.maximumCycleSize(mP));
  }
}
