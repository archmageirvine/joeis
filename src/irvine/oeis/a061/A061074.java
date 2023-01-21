package irvine.oeis.a061;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Pair;

/**
 * A061074 Smallest number that begins with 1, has digits in order 123...901... and is divisible by n. If no such number exists then a(n) = 0.
 * @author Sean A. Irvine
 */
public class A061074 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final HashSet<Pair<Long, Long>> seen = new HashSet<>();
    long a = 0;
    Z p = Z.ZERO;
    while (true) {
      if (++a > 9) {
        a = 0;
      }
      p = p.multiply(10).add(a);
      final long m = p.mod(mN);
      if (m == 0) {
        return p;
      }
      if (!seen.add(new Pair<>(m, a))) {
        return Z.ZERO;
      }
    }
  }
}
