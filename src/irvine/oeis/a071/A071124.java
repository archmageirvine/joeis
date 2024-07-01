package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a067.A067259;

/**
 * A060316.
 * @author Sean A. Irvine
 */
public class A071124 extends A067259 {

  private boolean is(final Z k) {
    for (long j = 1; j <= 4; ++j) {
      final Z t = k.add(j);
      if (!Predicates.CUBE_FREE.is(t)) {
        return false;
      }
      if (Predicates.SQUARE_FREE.is(t)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z k = super.next();
      if (is(k)) {
        return k;
      }
    }
  }
}
