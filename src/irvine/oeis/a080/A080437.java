package irvine.oeis.a080;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A080437 For n &lt; 5, a(n) = n-th prime. For n &gt;= 5, let m = n-th prime. If m is a k-digit prime then a(n) = smallest prime obtained by inserting at least one digit between every pair of digits of m. There are (k-1) places where digit insertion takes place and a(n) contains at least 2k-1 digits.
 * @author Sean A. Irvine
 */
public class A080437 extends A000040 {

  static Z search(final String s, final Z v, final int pos) {
    if (pos >= s.length()) {
      return v.isProbablePrime() ? v : null;
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

  static void searchHarder(final TreeSet<Z> soln, final String s, final Z v, final int pos) {
    if (pos >= s.length()) {
      if (v.isProbablePrime()) {
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
//    // Try 3 digits
//    final Z v1000 = v.multiply(1000);
//    for (long d = 0; d < 1000; ++d) {
//      searchHarder(p, soln, s, v1000.add(d).multiply(10).add(sdigit), pos + 1);
//    }
  }

  @Override
  public Z next() {
    final String s = String.valueOf(super.next());
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

