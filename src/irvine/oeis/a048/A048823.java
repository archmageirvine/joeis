package irvine.oeis.a048;

import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A048823 a(n) = value of n defined as follows: start with n and reach 2 by repeatedly either dividing by d where d &lt;= the square root or by subtracting 1. The division steps are free, but subtracting 1 costs 1 point. The "value" of n is the smallest cost to reach 2.
 * @author Sean A. Irvine
 */
public class A048823 extends Sequence2 {

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
        if (v > 2) {
          next.add(v - 1);
        }
        for (long s = LongUtils.sqrt(v); s >= 2; --s) {
          if (v % s == 0) {
            currentCost.add(v / s);
          }
        }
      }
    }
  }
}
