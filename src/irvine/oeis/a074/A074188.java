package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074188 Smallest power (&gt;=2) &gt;= n!.
 * @author Sean A. Irvine
 */
public class A074188 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 1) {
      return Z.ONE;
    }
    Z f = Functions.FACTORIAL.z(mN);
    while (!Predicates.POWER.is(f)) {
      f = f.add(1);
    }
    return f;
  }
}
