package irvine.oeis.a064;

import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.a066.A066031;

/**
 * A064623 Primitive subsequence of A066031: terms of A066031 which are not a multiple of some previous terms.
 * @author Sean A. Irvine
 */
public class A064623 extends A066031 {

  private final TreeSet<Z> mA = new TreeSet<>();

  private boolean is(final Z t) {
    for (final Z v : mA) {
      if (t.mod(v).isZero()) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = super.next();
      if (is(t)) {
        mA.add(t);
        return t;
      }
    }
  }
}
