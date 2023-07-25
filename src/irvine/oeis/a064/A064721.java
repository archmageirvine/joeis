package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064721 Potential Sierpi\u0144ski numbers: integers for which the smallest m &gt; 2^10 in A040076 such that n*2^m+1 is prime (A050921).
 * @author Sean A. Irvine
 */
public class A064721 extends Sequence1 {

  private static final long LIMIT = 1L << 10;
  private Z mN = Z.valueOf(382);

  private boolean is(Z n) {
    long m = 0;
    while (!n.add(1).isProbablePrime()) {
      n = n.multiply2();
      if (++m > LIMIT) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (is(mN)) {
        return mN;
      }
    }
  }
}
