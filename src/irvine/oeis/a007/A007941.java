package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.util.Permutation;

/**
 * A007941 Some nontrivial permutation of digits is a cube.
 * @author Sean A. Irvine
 */
public class A007941 extends A007939 {

  private boolean isPermCube(final Z n) {
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
      if (Z.valueOf(v).root(3).auxiliary() != 0) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (isPermCube(n)) {
        return n;
      }
    }
  }
}
