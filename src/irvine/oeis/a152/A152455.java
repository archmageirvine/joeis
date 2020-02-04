package irvine.oeis.a152;

import irvine.factor.factor.Cheetah;
import irvine.math.IntegerUtils;
import irvine.math.z.Euler;
import irvine.math.z.Z;
import irvine.oeis.MemorySequence;

/**
 * A152455 <code>a(n) =</code> minimal integer m such that there exists an m X m integer matrix of order <code>n</code>.
 * @author Sean A. Irvine
 */
public class A152455 extends MemorySequence {

  {
    add(null); // 0
  }

  @Override
  protected Z computeNext() {
    final int n = size();
    if (n <= 2) {
      return Z.valueOf(n - 1);
    }
    final Z[] m = Cheetah.factor(n).toZArray();
    if (m.length == 1) {
      // i.e. n == p^a
      return Euler.phi(Z.valueOf(n));
    }
    final int p = m[0].intValueExact();
    int s = 1;
    int t = n;
    while (t % p == 0) {
      t /= p;
      s *= p;
    }
    // (p, q) == 1
    assert IntegerUtils.gcd(s, t) == 1;
    return s == 2 ? a(t) : a(s).add(a(t));
  }
}
