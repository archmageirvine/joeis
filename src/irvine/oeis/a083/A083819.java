package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083819 a(1) = 1, then the smallest k &gt; 1 such that nk + 1 is the digit reversal of k + 1, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A083819 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN > 6) {
      return Z.ZERO;
    }
    final Z n = Z.valueOf(mN);
    long k = 1;
    long lim = 10;
    while (true) {
      if (++k == lim) {
        lim *= 10;
      }
      final Z t = n.multiply(k).add(1);
      if (Functions.REVERSE.z(k + 1).equals(t)) {
        return Z.valueOf(k);
      }
    }
  }
}
