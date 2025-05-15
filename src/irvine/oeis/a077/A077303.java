package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a033.A033308;

/**
 * A077303 Partition the concatenation 235711131719232931...of prime numbers into successive strings such that the n-th string is a multiple of n and &gt;n.
 * @author Sean A. Irvine
 */
public class A077303 extends Sequence1 {

  private final Sequence mDigits = new A033308();
  private long mN = 0;
  private Z mA = mDigits.next();

  @Override
  public Z next() {
    ++mN;
    Z v = Z.ZERO;
    while (true) {
      do {
        v = v.multiply(10).add(mA);
        mA = mDigits.next();
      } while (mA.isZero());
      if (v.mod(mN) == 0 && !v.equals(mN)) {
        return v;
      }
    }
  }
}
