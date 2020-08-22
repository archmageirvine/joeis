package irvine.oeis.a032;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032691 Exactly 1 digit from {1,2,3,4,5,6,7,8,9} can precede a term to form a prime.
 * @author Sean A. Irvine
 */
public class A032691 implements Sequence {

  private long mN = -1;

  protected int expected() {
    return 1;
  }

  private boolean is(final long n) {
    int seen = 0;
    final String s = String.valueOf(n);
    for (int prefix = 1; prefix <= 9; ++prefix) {
      if (new Z(prefix + s).isProbablePrime() && ++seen > expected()) {
        return false;
      }
    }
    return seen == expected();
  }

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (mN % 5 != 0 && is(mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
