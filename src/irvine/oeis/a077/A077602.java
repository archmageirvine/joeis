package irvine.oeis.a077;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a074.A074586;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A077602.
 * @author Sean A. Irvine
 */
public class A077602 extends DecimalExpansionSequence {

  private static final int LIM_INF_HEURISTIC = 3;

  /** Construct the sequence. */
  public A077602() {
    super(1, new CR() {
      @Override
      protected Z approximate(final int precision) {
        final Sequence r = new A074586();
        long k = 0;
        Z a = Z.ZERO;
        int equalsCount = 0;
        while (true) {
          ++k;
          Z s = Z.ZERO;
          for (long j = 0; j < k; ++j) {
            s = s.add(r.next());
          }
          final Z t = s.shiftRight(k + precision);
          if (t.equals(a)) {
            if (++equalsCount > LIM_INF_HEURISTIC) {
              return a;
            }
          } else {
            a = t;
            equalsCount = 0;
          }
        }
      }
    });
  }
}
