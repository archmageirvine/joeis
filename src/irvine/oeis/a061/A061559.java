package irvine.oeis.a061;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A061559 Array read by antidiagonals: T(k,d) = number of different hyperplanes in d-space with integer coefficients in set {-k,...,-1,0,1,...,k}.
 * @author Sean A. Irvine
 */
public class A061559 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  // Number of n-tuples (a,b,...) with 1<=a,b,...<=k and gcd(a,b,...)=1
  private Z m(final int n, final int m) {
    final Bumper bumper = BumperFactory.range(1, m);
    final int[] tuple = new int[n];
    Arrays.fill(tuple, 1);
    long cnt = 0;
    do {
      if (Functions.GCD.i(tuple) == 1) {
        ++cnt;
      }
    } while (bumper.bump(tuple));
    return Z.valueOf(cnt);
  }

  private Z t(final int n, final int m) {
    return Integers.SINGLETON.sum(0, m - 1, k -> m(m + 1 - k, n).multiply2().add(m(m - k, n)).multiply(Binomial.binomial(m, k)).shiftLeft(m - k - 1));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 0;
    }
    return t(mN - mM, mM + 1);
  }
}
