package irvine.oeis.a065;

import java.util.Arrays;

import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A065161 Number of orbits into which the Foata transform partitions the symmetric group Sn, i.e., a(n) is the number of cycles in the permutations A065181 - A065184 found in range [0,n!-1].
 * @author Sean A. Irvine
 */
public class A065161 extends Sequence1 {

  private final A065181 mSeq = new A065181();
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
      mP[k] = mSeq.next().intValueExact();
    }
    return Z.valueOf(IntegerPermutation.countCycles(mP, 1));
  }
}
