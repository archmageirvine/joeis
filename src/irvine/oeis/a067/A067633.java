package irvine.oeis.a067;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067633 a(1) = 1; sequence of digits of a(n)^2 is a subsequence of the sequence of digits of a(n+1)^2.
 * @author Sean A. Irvine
 */
public class A067633 extends Sequence1 {

  private Z mA = null;

  // Try inserting a single digits
  private Z search1(final String s) {
    final TreeSet<Z> res = new TreeSet<>();
    for (int pos = 0; pos <= s.length(); ++pos) {
      final String left = s.substring(0, pos);
      final String right = s.substring(pos);
      for (char a = pos == 0 ? '1' : '0'; a <= '9'; ++a) {
        final Z c = new Z(left + a + right);
        if (c.isSquare()) {
          res.add(c);
        }
      }
    }
    return res.isEmpty() ? null : res.pollFirst().sqrt();
  }

  // Try inserting two digits
  private Z search2(final String s) {
    final TreeSet<Z> res = new TreeSet<>();
    for (int pos1 = 0; pos1 <= s.length(); ++pos1) {
      final String left = s.substring(0, pos1);
      for (char a = pos1 == 0 ? '1' : '0'; a <= '9'; ++a) {
        for (int pos2 = pos1; pos2 <= s.length(); ++pos2) {
          final String left1 = left + a + s.substring(pos1, pos2);
          final String right = s.substring(pos2);
          for (char b = '0'; b <= '9'; ++b) {
            final Z c = new Z(left1 + b + right);
            if (c.isSquare()) {
              res.add(c);
            }
          }
        }
      }
    }
    return res.isEmpty() ? null : res.pollFirst().sqrt();
  }

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else {
      final String s = mA.square().toString();
      final Z s1 = search1(s);
      if (s1 != null) {
        mA = s1;
        return s1;
      }
      final Z s2 = search2(s);
      if (s2 != null) {
        mA = s2;
        return s2;
      }
      // 2 digits is always enough because of the 36...67 pattern
      throw new RuntimeException();
    }
  }
}
