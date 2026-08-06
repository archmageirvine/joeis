package irvine.oeis.a086;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086884 Smallest string of 1's and 0's which is prime in every base from 2 to n.
 * @author Sean A. Irvine
 */
public class A086884 extends Sequence2 {

  private int mN = 1;

  private boolean isOk(final String s) {
    for (int b = 2; b <= mN; ++b) {
      if (!new Z(s, b).isProbablePrime()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    ++mN;
    if (mN < 4) {
      return Z.TEN;
    }
    long k = 3;
    while (true) {
      final String s = Long.toBinaryString(k);
      if (isOk(s)) {
        return new Z(s);
      }
      k += 2;
    }
  }
}
