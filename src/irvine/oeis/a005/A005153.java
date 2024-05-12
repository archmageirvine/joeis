package irvine.oeis.a005;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005153 Practical numbers: positive integers m such that every k &lt;= sigma(m) is a sum of distinct divisors of m. Also called panarithmic numbers.
 * @author Sean A. Irvine
 */
public class A005153 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      final long n = ++mN;
      if (Predicates.PRACTICAL.is(n)) {
        return Z.valueOf(mN);
      }
    }
  }
}
