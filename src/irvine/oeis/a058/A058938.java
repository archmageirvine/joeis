package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a000.A000796;

/**
 * A058938 Numbers k such that the sum of the first k digits of the decimal expansion of Pi is prime.
 * @author Georg Fischer
 */
public class A058938 extends A000796 {

  private long mN = 0;
  private Z mSum = Z.ZERO;

  @Override
  public Z next() {
    ++mN;
    mSum = mSum.add(super.next());
    while (!mSum.isPrime()) {
      ++mN;
      mSum = mSum.add(super.next());
    }
    return Z.valueOf(mN);
  }
}
