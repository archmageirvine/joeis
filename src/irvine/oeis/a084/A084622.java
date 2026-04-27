package irvine.oeis.a084;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A084622 Numbers n such that f(n) is a strict local extremum for the function f(x) = phi(x) + sigma(x); i.e., either f(n) &gt; f(n-1) and f(n) &gt; f(n+1) or f(n) &lt; f(n-1) and f(n) &lt; f(n+1).
 * @author Sean A. Irvine
 */
public class A084622 extends Sequence1 {

  private long mN = 10;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final long b0 = Functions.PHI.l(mN) + Functions.SIGMA1.l(mN);
      final long b1 = Functions.PHI.l(mN + 1) + Functions.SIGMA1.l(mN + 1);
      final long b2 = Functions.PHI.l(mN + 2) + Functions.SIGMA1.l(mN + 2);
      if (b0 < b1 && b1 > b2 || b0 > b1 && b1 < b2) {
        return Z.valueOf(mN + 1);
      }
    }
  }
}

