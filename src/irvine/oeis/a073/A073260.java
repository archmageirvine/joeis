package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073260 Length of FixedPointList leading to value of [10^n]-th composite number.
 * @author Sean A. Irvine
 */
public class A073260 extends Sequence1 {

  private long mN = 0;

  private Z f(final Z n, final Z m) {
    return n.add(Functions.PRIME_PI.l(m)).add(1);
  }

  @Override
  public Z next() {
    final Z w = Z.TEN.pow(++mN);
    Z m = w;
    long cnt = 0;
    while (true) {
      final Z t = m;
      m = f(w, m);
      ++cnt;
      if (t.equals(m)) {
        return Z.valueOf(cnt);
      }
    }
  }
}

