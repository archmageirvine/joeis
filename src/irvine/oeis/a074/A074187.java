package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074187 Largest power (&gt;=2) &lt;= n!.
 * @author Sean A. Irvine
 */
public class A074187 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.ONE;
    }
    Z f = Functions.FACTORIAL.z(mN);
    while (!Predicates.POWER.is(f)) {
      f = f.subtract(1);
    }
    return f;
  }
}
