package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071829 Smallest s &gt; 0 such that Lpf(n) = Lpf(n+s) where Lpf(x) denotes the largest prime factor in x factorization.
 * @author Sean A. Irvine
 */
public class A071829 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    final long t = Functions.GPF.l(++mN);
    long m = 0;
    while (true) {
      if (t == Functions.GPF.l(mN + ++m)) {
        return Z.valueOf(m);
      }
    }
  }
}
