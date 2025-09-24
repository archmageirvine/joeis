package irvine.oeis.a080;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A060010.
 * @author Sean A. Irvine
 */
public class A080608 extends A000040 {

  private final HashSet<Z> mDeleteable = new HashSet<>();

  private boolean is(final Z p) {
    if (p.compareTo(Z.TEN) < 0 || mDeleteable.contains(p)) {
      return true;
    }
    final String s = p.toString();
    for (int k = 0; k < s.length(); ++k) {
      final Z q = new Z(s.substring(0, k) + s.substring(k + 1));
      if (mDeleteable.contains(q)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        mDeleteable.add(p);
        return p;
      }
    }
  }
}
