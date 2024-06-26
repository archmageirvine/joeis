package irvine.oeis.a067;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A067281 Number of permutations of {1,2,3,...,n} where the elements of n are considered indistinguishable if they differ by a power of 2 (for example 3, 12 and 24 are all considered equivalent).
 * @author Sean A. Irvine
 */
public class A067281 extends Sequence0 {

  private int mN = -1;
  private int[] mA = {};

  @Override
  public Z next() {
    final int t = Functions.MAKE_ODD.i(++mN);
    if (t >= mA.length) {
      mA = Arrays.copyOf(mA, t + 1);
    }
    ++mA[t];
    return Binomial.multinomial(mN, mA);
  }
}
