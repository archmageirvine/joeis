package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083023 a(n) = number of partitions of n into a pair of parts n=p+q, p&gt;=q&gt;=0, with p-q equal to a square &gt;= 0.
 * @author Sean A. Irvine
 */
public class A083023 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    final long f = (mN & 1) == 0 ? Functions.SQRT.l(mN - 2) / 2 + 1 : (Functions.SQRT.l(mN - 2) - 1) / 2 + 1;
    return Z.valueOf(Predicates.SQUARE.is(mN) ? f + 1 : f);
  }
}
