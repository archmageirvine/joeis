package irvine.oeis.a153;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A153980 Positive integers n equal to the sum of all the different integers formed by the digits of n (n itself excluded), keeping the order of the digits.
 * @author Sean A. Irvine
 */
public class A153980 extends Sequence1 {

  private Z mN = Z.valueOf(259145);

  private HashSet<String> substrings(final String s) {
    final HashSet<String> r = new HashSet<>();
    // Special case small sizes for efficiency
    switch (s.length()) {
    case 0:
      return r;
    case 1:
      r.add(s);
      return r;
    case 2:
      r.add(s);
      r.add(s.substring(0, 1));
      r.add(s.substring(1));
      return r;
    case 3:
      r.add(s);
      final String a = s.substring(0, 1);
      r.add(a);
      r.add(s.substring(0, 2));
      r.add(s.substring(1, 2));
      r.add(s.substring(1));
      final String c = s.substring(2);
      r.add(c);
      r.add(a + c);
      return r;
    case 4:
      final HashSet<String> sub = substrings(s.substring(1));
      r.addAll(sub);
      final String first = s.substring(0, 1);
      r.add(first);
      for (final String v : sub) {
        r.add(first + v);
      }
      return r;
    default:
      final int splitPoint = s.length() / 2;
      final HashSet<String> left = substrings(s.substring(0, splitPoint));
      final HashSet<String> right = substrings(s.substring(splitPoint));
      r.addAll(left);
      r.addAll(right);
      for (final String l : left) {
        for (final String k : right) {
          r.add(l + k);
        }
      }
      return r;
    }
  }

  private Z sum(final HashSet<String> set) {
    Z sum = Z.ZERO;
    for (final String v : set) {
      if (v.charAt(0) != '0') {
        sum = sum.add(new Z(v));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      if (mN.multiply2().equals(sum(substrings(mN.toString())))) {
        return mN;
      }
    }
  }
}

