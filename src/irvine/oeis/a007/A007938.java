package irvine.oeis.a007;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.util.Permutation;

/**
 * A007938 Some nontrivial permutation of digits is a square.
 * @author Sean A. Irvine
 */
public class A007938 extends A007936 {

  private boolean isPermSquare(final Z n) {
    final String s = n.toString();
    final Permutation perm = new Permutation(s.length());
    perm.next(); // skip trivial permutation
    int[] p;
    while ((p = perm.next()) != null) {
      long v = 0;
      for (final int t : p) {
        v *= 10;
        v += s.charAt(t) - '0';
      }
      final long sqrt = LongUtils.sqrt(v);
      if (sqrt * sqrt == v) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (isPermSquare(n)) {
        return n;
      }
    }
  }
}
