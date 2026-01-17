package irvine.oeis.a392;

import java.util.HashMap;

import irvine.factor.factor.Jaguar;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392079 a(n) is the maximum count of equal differences among consecutive divisors of A259366(n).
 * @author Sean A. Irvine
 */
public class A392079 extends Sequence1 {

  private long mN = 5;

  private int count(final long n) {
    Z prev = null;
    final HashMap<Z, Integer> seen = new HashMap<>();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (prev != null) {
        seen.merge(d.subtract(prev), 1, Integer::sum);
      }
      prev = d;
    }
    return IntegerUtils.max(seen.values());
  }

  @Override
  public Z next() {
    while (true) {
      final int count = count(++mN);
      if (count > 1) {
        return Z.valueOf(count);
      }
    }
  }
}

