package irvine.oeis.a080;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080436 Smallest multiple of n obtained by inserting digits between every pair of digits of n. If n is a k-digit number then there are (k-1) places where digit insertion takes place and a(n) contains at least 2k-1 digits.
 * @author Sean A. Irvine
 */
public class A080436 extends Sequence1 {

  private long mN = 0;

  private Z search(final String s, final Z v, final int pos) {
    if (pos >= s.length()) {
      return v.mod(mN) == 0 ? v : null;
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

  // Try up to 3 digits
  private void searchHarder(final TreeSet<Z> soln, final String s, final Z v, final int pos) {
    if (pos >= s.length()) {
      if (v.mod(mN) == 0) {
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
    // Try 3 digits
    final Z v1000 = v.multiply(1000);
    for (long d = 0; d < 1000; ++d) {
      searchHarder(soln, s, v1000.add(d).multiply(10).add(sdigit), pos + 1);
    }
  }

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
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

