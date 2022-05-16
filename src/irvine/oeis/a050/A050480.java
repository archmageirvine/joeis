package irvine.oeis.a050;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A050480 Numbers that can be written as a concatenation of distinct proper divisors.
 * @author Sean A. Irvine
 */
public class A050480 implements Sequence {

  private long mN = 11;

  private boolean isConcat(final HashSet<String> divisors, final HashSet<String> used, final String n) {
    if (n.isEmpty()) {
      return true;
    }
    for (int k = 1; k <= n.length(); ++k) {
      final String prefix = n.substring(0, k);
      if (divisors.contains(prefix) && used.add(prefix)) {
        if (isConcat(divisors, used, n.substring(k))) {
          return true;
        }
        used.remove(prefix);
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final HashSet<String> divisors = new HashSet<>();
      for (final Z dd : Jaguar.factor(++mN).divisors()) {
        final long d = dd.longValue();
        if (d < mN) {
          divisors.add(String.valueOf(d));
        }
      }
      if (divisors.size() > 1 && isConcat(divisors, new HashSet<>(), String.valueOf(mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
