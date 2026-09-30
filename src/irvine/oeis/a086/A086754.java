package irvine.oeis.a086;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086754 Pascal's square pyramid read by slices, each slice being read by rows. Each entry in slice n is the sum of the 4 entries above it in slice n-1.
 * @author Sean A. Irvine
 */
public class A086754 extends Sequence1 {

  private long mN = 0;
  private long mI = 0;
  private long mJ = -1;

  @Override
  public Z next() {
    if (++mJ > mN) {
      if (++mI > mN) {
        ++mN;
        mI = 0;
      }
      mJ = 0;
    }
    return Binomial.binomial(mN, mI).multiply(Binomial.binomial(mN, mJ));
  }
}
