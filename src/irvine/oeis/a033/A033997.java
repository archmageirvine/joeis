package irvine.oeis.a033;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A033997 Numbers n such that sum of first n primes is a square.
 * @author Sean A. Irvine
 */
public class A033997 extends A000040 {

  private Z mSum = Z.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      mSum = mSum.add(super.next());
      if (mSum.isSquare()) {
        return Z.valueOf(mN);
      }
    }
  }
}
