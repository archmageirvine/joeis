package irvine.oeis.a047;

import java.util.Arrays;
import java.util.Comparator;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A047869 Subsets of an 8-element set in order by number of elements in each subset.
 * @author Sean A. Irvine
 */
public class A047869 extends Sequence1 {

  private final Z[] mA = new Z[256];
  {
    for (int k = 0; k < mA.length; ++k) {
      mA[k] = Z.valueOf(k);
    }
    Arrays.sort(mA, Comparator.comparingInt(Z::bitCount).thenComparing(a -> a));
  }
  private int mN = 0;

  @Override
  public Z next() {
    if (mN < mA.length) {
      return mA[mN++];
    }
    return null;
  }
}

