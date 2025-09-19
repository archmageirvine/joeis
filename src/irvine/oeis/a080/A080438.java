package irvine.oeis.a080;

import java.util.TreeSet;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A080438 Smallest square obtained by inserting one or more digits between every pair of consecutive digits of n^2.
 * @author Sean A. Irvine
 */
public class A080438 extends Sequence1 {

  private final Sequence mA = new A000290().skip();

  private Z search(final String s, final Z v, final int pos) {
    if (pos >= s.length()) {
      return Predicates.SQUARE.is(v) ? v : null;
    }
    final Z v10 = v.multiply(10);
    final long sdigit = s.charAt(pos) - '0';
    for (long d = 0; d < 10; ++d) {
      final Z res = search(s, v10.add(d).multiply(10).add(sdigit), pos + 1);
      if (res != null) {
        return res;
      }
    }
    return null;
  }

  private void searchHarder(final TreeSet<Z> soln, final String s, final Z v, final int pos) {
    if (pos >= s.length()) {
      if (Predicates.SQUARE.is(v)) {
        soln.add(v);
      }
      return;
    }
    // Try 1 digit
    final Z v10 = v.multiply(10);
    final long sdigit = s.charAt(pos) - '0';
    for (long d = 0; d < 10; ++d) {
      searchHarder(soln, s, v10.add(d).multiply(10).add(sdigit), pos + 1);
    }
    // Try 2 digits
    final Z v100 = v.multiply(100);
    for (long d = 0; d < 100; ++d) {
      searchHarder(soln, s, v100.add(d).multiply(10).add(sdigit), pos + 1);
    }
  }

  @Override
  public Z next() {
    final String s = String.valueOf(mA.next());
    final Z res = search(s, Z.valueOf(s.charAt(0) - '0'), 1);
    if (res != null) {
      return res;
    }
    final TreeSet<Z> set = new TreeSet<>();
    searchHarder(set, s, Z.valueOf(s.charAt(0) - '0'), 1);
    if (set.isEmpty()) {
      throw new RuntimeException("Search was insufficient to find a solution");
    }
    return set.pollFirst();
  }
}

