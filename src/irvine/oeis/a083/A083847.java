package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083847 a(n) = number of primes of the form x^2 + 1 &lt;= 2^n.
 * @author Sean A. Irvine
 */
public class A083847 extends Sequence1 {

  private Z mLim = Z.ONE;
  private long mCount = 0;
  private long mM = 1;

  @Override
  public Z next() {
    mLim = mLim.multiply2();
    while (true) {
      final Z t = Z.valueOf(mM).square().add(1);
      if (t.compareTo(mLim) > 0) {
        return Z.valueOf(mCount);
      }
      if (t.isProbablePrime()) {
        ++mCount;
      }
      ++mM;
    }
  }
}
