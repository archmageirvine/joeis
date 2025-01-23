package irvine.oeis.a074;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.a000.A000290;

/**
 * A074228.
 * @author Sean A. Irvine
 */
public class A074491 extends A000040 {

  private boolean is(final Z p) {
    final String s = p.toString();
    final Sequence squares = new A000290();
    Z sq;
    while ((sq = squares.next()).compareTo(p) < 0) {
      if (s.contains(sq.toString())) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (is(p)) {
        return p;
      }
    }
  }
}
