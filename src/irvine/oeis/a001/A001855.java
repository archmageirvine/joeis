package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A001855 Sorting numbers: maximal number of comparisons for sorting n elements by binary insertion.
 * @author Sean A. Irvine
 */
public class A001855 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 0;
    long s = 1;
    while (s < mN) {
      s <<= 1;
      ++k;
    }
    return Z.valueOf(1 + mN * k - s);
  }
}
