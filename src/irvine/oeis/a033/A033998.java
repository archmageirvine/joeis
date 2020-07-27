package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033998 Numbers n such that the sum of the primes <code>&lt;= n</code> is a square.
 * @author Sean A. Irvine
 */
public class A033998 extends A000040 {

  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      mSum = mSum.add(p);
      if (mSum.isSquare()) {
        return p;
      }
    }
  }
}
