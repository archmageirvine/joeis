package irvine.oeis.a047;

import java.util.TreeSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A047988 Start with n and reach 2 by repeatedly either dividing by d where d &lt;= the square root or by adding or subtracting 1. The division steps are free, but adding or subtracting 1 costs 1 point. a(n) is the smallest cost to reach 2.
 * @author Sean A. Irvine
 */
public class A047988 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    int cost = 0;
    final TreeSet<Long> expanded = new TreeSet<>(); // values already encountered
    TreeSet<Long> currentCost = new TreeSet<>(); // values having current cost
    TreeSet<Long> next = new TreeSet<>(); // values that cost one more
    currentCost.add(mN);
    while (true) {
      if (currentCost.isEmpty()) {
        currentCost = next;
        next = new TreeSet<>();
        ++cost;
      }
      final long v = currentCost.pollFirst();
      if (v == 2) {
        return Z.valueOf(cost);
      }
      if (expanded.add(v)) {
        next.add(v + 1);
        if (v > 2) {
          next.add(v - 1);
        }
        for (long s = Functions.SQRT.l(v); s >= 2; --s) {
          if (v % s == 0) {
            currentCost.add(v / s);
          }
        }
      }
    }
  }
}
