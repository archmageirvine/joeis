package irvine.oeis.a392;

import java.util.HashSet;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A392080 a(n) is the number of repeated difference values among the consecutive divisors of A259366(n).
 * @author Sean A. Irvine
 */
public class A392080 extends Sequence1 {

  private long mN = 5;

  private int count(final long n) {
    Z prev = null;
    final HashSet<Z> seenTwice = new HashSet<>();
    final HashSet<Z> seen = new HashSet<>();
    for (final Z d : Jaguar.factor(n).divisorsSorted()) {
      if (prev != null) {
        final Z diff = d.subtract(prev);
        if (!seen.add(diff)) {
          seenTwice.add(diff);
        }
      }
      prev = d;
    }
    return seenTwice.size();
  }

  @Override
  public Z next() {
    while (true) {
      final int count = count(++mN);
      if (count > 0) {
        return Z.valueOf(count);
      }
    }
  }
}

