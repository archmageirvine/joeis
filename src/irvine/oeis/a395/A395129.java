package irvine.oeis.a395;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395129 Numbers k that are the concatenation of three distinct divisors of k.
 * @author Sean A. Irvine
 */
public class A395129 extends Sequence1 {

  private long mN = 123;

  private boolean is(final String n, final Set<String> d, final int remaining) {
    if (n.isEmpty()) {
      return remaining == 0;
    }
    for (int k = 1; k <= n.length(); ++k) {
      final String s = n.substring(0, k);
      if (d.remove(s)) {
        if (is(n.substring(k), d, remaining - 1)) {
          return true;
        }
        d.add(s);
      }
    }
    return false;
  }

  private boolean is(final long n) {
    final Set<String> divs = new HashSet<>();
    for (final Z d : Jaguar.factor(n).divisors()) {
      divs.add(d.toString());
    }
    return is(String.valueOf(n), divs, 3);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
