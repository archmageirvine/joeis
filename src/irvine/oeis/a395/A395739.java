package irvine.oeis.a395;

import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.a396.A396491;

/**
 * A395739 Number of unsatisfiable 3-SAT formulas with n variables and 6 clauses in the multiset clause model.
 * @author Sean A. Irvine
 */
public class A395739 extends A396491 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final List<Long> clauses = clauses(mN);
    final int m = clauses.size();
    final long[] formula = new long[6];
    Z count = Z.ZERO;
    for (int i1 = 0; i1 < m; ++i1) {
      formula[0] = clauses.get(i1);
      for (int i2 = i1; i2 < m; ++i2) {
        formula[1] = clauses.get(i2);
        for (int i3 = i2; i3 < m; ++i3) {
          formula[2] = clauses.get(i3);
          for (int i4 = i3; i4 < m; ++i4) {
            formula[3] = clauses.get(i4);
            for (int i5 = i4; i5 < m; ++i5) {
              formula[4] = clauses.get(i5);
              for (int i6 = i5; i6 < m; ++i6) {
                formula[5] = clauses.get(i6);
                if (unsat(mN, formula)) {
                  count = count.add(1);
                }
              }
            }
          }
        }
      }
    }
    return count;
  }
}
