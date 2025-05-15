package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a033.A033308;

/**
 * A077304 Partition the concatenation 235711131719232931...of prime numbers into successive strings such that the n-th string is a multiple of prime(n) and &gt; prime(n).
 * @author Sean A. Irvine
 */
public class A077304 extends A000040 {

  private final Sequence mDigits = new A033308();
  private Z mA = mDigits.next();

  @Override
  public Z next() {
    final Z p = super.next();
    Z v = Z.ZERO;
    while (true) {
      do {
        v = v.multiply(10).add(mA);
        mA = mDigits.next();
      } while (mA.isZero());
      if (v.mod(p).isZero() && !v.equals(p)) {
        return v;
      }
    }
  }
}
