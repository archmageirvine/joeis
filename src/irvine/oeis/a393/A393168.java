package irvine.oeis.a393;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A393168 allocated for Emmanuel Osalotioman Osazuwa.
 * @author Sean A. Irvine
 */
public class A393168 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long x = 0; x * x <= mN; ++x) {
        for (long y = 0; y <= x; ++y) {
          final long z2 = x * x + y * y - mN;
          if (z2 >= 0 && z2 <= mN && Predicates.SQUARE.is(z2)) {
            return Z.valueOf(mN);
          }
        }
      }
    }
  }
}
