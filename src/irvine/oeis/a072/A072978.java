package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072978 Numbers of the form m * 2^bigomega(m), where m&gt;1 is odd and bigomega(m) = A001222(m), the number of prime factors of m.
 * @author Sean A. Irvine
 */
public class A072978 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      long m = ++ mN;
      int cnt = 0;
      while ((m & 1) == 0) {
        ++cnt;
        m /= 2;
      }
      if (Functions.BIG_OMEGA.l(m) == cnt) {
        return Z.valueOf(mN);
      }
    }
  }
}

