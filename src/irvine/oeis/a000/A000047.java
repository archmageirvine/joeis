package irvine.oeis.a000;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000047 Number of integers &lt;= 2^n of form x^2 - 2y^2.
 * @author Sean A. Irvine
 */
public class A000047 extends Sequence0 {

  private long mLastResult = 0;
  private long mN = 1;

  @Override
  public Z next() {
    long c = 0;
    for (long m = (mN >>> 1) + 1; m <= mN; ++m) {
      final FactorSequence fs = Jaguar.factor(m);
      boolean ok = true;
      for (final Z t : fs.toZArray()) {
        final long mod = t.longValue() & 7;
        if ((mod == 3 || mod == 5) && (fs.getExponent(t) & 1) == 1) {
          ok = false;
          break;
        }
      }
      if (ok) {
        ++c;
      }
    }
    mN <<= 1;
    mLastResult += c;
    return Z.valueOf(mLastResult);
  }
}

