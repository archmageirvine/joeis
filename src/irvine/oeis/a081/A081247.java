package irvine.oeis.a081;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A081247 Number of numbers 1&lt;=k&lt;=n with mu(k+n)=mu(k), where mu=A008683 (Moebius function).
 * @author Sean A. Irvine
 */
public class A081247 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN; ++k) {
      if (Functions.MOBIUS.i(k) == Functions.MOBIUS.i(mN + k)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
