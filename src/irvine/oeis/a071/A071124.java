package irvine.oeis.a071;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a067.A067259;

/**
 * A071124 Least of five consecutive numbers which are cubefree and not squarefree, i.e., {k, k+1, k+2, k+3, k+4} are in A067259.
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
