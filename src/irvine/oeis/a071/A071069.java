package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071069 a(n) = min { A070923(k) | n^3 &lt; k &lt; (n+1)^3 }.
 * @author Sean A. Irvine
 */
public class A071069 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long lo = mN * mN * mN + 1;
    final long hi = (mN + 1) * (mN + 1) * (mN + 1);
    final long d = hi - lo;
    long s = 0;
    while (true) {
      long sum = 0;
      for (long k = lo; k < hi; ++k) {
        final Z k2 = Z.valueOf(k).square();
        sum += Functions.CEIL_CBRT.z(k2).pow(3).subtract(k2).subtract(s).signum();
      }
      if (sum != d) {
        break;
      }
      ++s;
    }
    return Z.valueOf(s);
  }
}

