package irvine.oeis.a071;

import irvine.math.z.Z;
import irvine.oeis.a001.A001113;

/**
 * A071117 Sum of first n digits of decimal expansion of e is prime.
 * @author Georg Fischer
 */
public class A071117 extends A001113 {

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
