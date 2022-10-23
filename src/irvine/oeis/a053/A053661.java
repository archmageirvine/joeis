package irvine.oeis.a053;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053661 For n &gt; 1: if n is present, 2n is not.
 * @author Sean A. Irvine
 */
public class A053661 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      if (mN > 1 && (mN & (mN - 1)) == 0 ? (Long.numberOfTrailingZeros(mN) & 1) == 1 : (Long.numberOfTrailingZeros(mN) & 1) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
