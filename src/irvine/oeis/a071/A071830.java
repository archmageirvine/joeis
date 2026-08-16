package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071830 Smallest k &gt; n such that gpf(n) = gpf(k) where gpf = A006530 (greatest prime factor).
 * @author Sean A. Irvine
 */
public class A071830 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    final long t = Functions.GPF.l(++mN);
    long m = mN;
    while (true) {
      if (t == Functions.GPF.l(++m)) {
        return Z.valueOf(m);
      }
    }
  }
}
