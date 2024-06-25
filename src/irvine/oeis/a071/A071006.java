package irvine.oeis.a071;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071006 Number of positive solutions to the Diophantine equation x^2+y^3=n^2.
 * @author Sean A. Irvine
 */
public class A071006 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long n2 = ++mN * mN;
    int cnt = 0;
    for (long x = 1; x * x < n2; ++x) {
      if (Predicates.CUBE.is(n2 - x * x) && Functions.CBRT.l(n2 - x * x) <= x) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
