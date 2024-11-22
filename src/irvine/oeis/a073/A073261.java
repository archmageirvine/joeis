package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A073261 Length of FixedPointList approximating (2^n)-th composite number. See program link below.
 * @author Sean A. Irvine
 */
public class A073261 extends Sequence0 {

  private long mN = -1;

  private Z f(final Z n, final Z m) {
    return n.add(Functions.PRIME_PI.l(m)).add(1);
  }

  @Override
  public Z next() {
    final Z w = Z.TWO.pow(++mN);
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

