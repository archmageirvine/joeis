package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083128 Least 3-brilliant number of size n.
 * @author Sean A. Irvine
 */
public class A083182 extends Sequence1 {

  private long mN = 0;
  private Z mA = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    mA = mA.multiply(10);
    if (mN % 3 == 0) {
      return Functions.PREV_PRIME.z(Z.TEN.pow(mN / 3)).pow(3);
    }
    Z t = mA;
    while (true) {
      t = t.subtract(1);
      if (Predicates.BRILLIANT.is(3, t)) {
        return t;
      }
    }
  }
}

