package irvine.oeis.a067;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067742 Number of middle divisors of n, i.e., divisors in the half-open interval [sqrt(n/2), sqrt(n*2)).
 * @author Sean A. Irvine
 */
public class A067742 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    long cnt = 0;
    for (final Z dd : Jaguar.factor(++mN).divisors()) {
      final long d = dd.square().longValueExact();
      if (2 * d >= mN && d < 2 * mN) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
