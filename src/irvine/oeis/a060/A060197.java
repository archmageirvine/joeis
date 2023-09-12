package irvine.oeis.a060;

import irvine.factor.prime.Puma;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060197 Start at n, repeatedly apply pi(x) until reach 0; a(n) = number of steps to reach 0.
 * @author Sean A. Irvine
 */
public class A060197 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 1;
    long t = mN;
    while (t != 0) {
      ++cnt;
      t = Puma.primePi(t);
    }
    return Z.valueOf(cnt);
  }
}
