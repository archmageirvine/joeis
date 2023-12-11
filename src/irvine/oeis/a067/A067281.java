package irvine.oeis.a067;

import java.util.Arrays;

import irvine.math.IntegerUtils;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067281 Number of permutations of {1,2,3,...,n} where the elements of n are considered indistinguishable if they differ by a power of 2 (for example 3, 12 and 24 are all considered equivalent).
 * @author Sean A. Irvine
 */
public class A067281 extends Sequence1 {

  private int mN = 0;
  private int[] mA = {};

  @Override
  public Z next() {
    final int t = IntegerUtils.makeOdd(++mN);
    if (t >= mA.length) {
      mA = Arrays.copyOf(mA, t + 1);
    }
    ++mA[t];
    return Binomial.multinomial(mN, mA);
  }
}
