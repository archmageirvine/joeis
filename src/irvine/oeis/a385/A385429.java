package irvine.oeis.a385;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A385429 Number of triples (di, dj, dk) of divisors of 2*n such that di+dj = dk.
 * @author Sean A. Irvine
 */
public class A385429 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    final long[] d = ZUtils.toLong(Jaguar.factor(mN).divisors());
    final HashSet<Long> s = new HashSet<>();
    for (final long v : d) {
      s.add(v);
    }
    long sum = 0;
    for (final long u : d) {
      for (final long v : d) {
        if (s.contains(u + v)) {
          sum += u == v ? 1 : 2;
        }
        if (u == v) {
          break;
        }
      }
    }
    return Z.valueOf(sum);
  }
}

