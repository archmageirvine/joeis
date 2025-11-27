package irvine.oeis.a082;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082174 Number of primitive reduced indefinite quadratic forms over the integers in two variables with discriminants D(n)=A079896(n).
 * @author Sean A. Irvine
 */
public class A082175 extends Sequence1 {

  // After Robin Visser

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long res = 0;
    long d = 5;
    long i = 1;
    while (i < mN) {
      ++d;
      if ((d & 3) <= 1 && !Predicates.SQUARE.is(d)) {
        ++i;
      }
    }
    final long sqrtd = Functions.SQRT.l(d);
    for (long b = 1; b <= sqrtd; ++b) {
      if (((d - b * b) & 3) != 0) {
        continue;
      }
      for (final Z aa : Jaguar.factor((d - b * b) / 4).divisors()) {
        final long a = aa.longValue();
        if (Math.abs(sqrtd - 2 * a) < b) {
          ++res;
        }
      }
    }
    return Z.valueOf(2 * res);
  }
}
