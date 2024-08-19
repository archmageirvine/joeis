package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A071830 Smallest k &gt; n such that Lpf(n) = Lpf(k) where Lpf(x) denotes the largest prime factor in x factorization.
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
