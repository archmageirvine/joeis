package irvine.oeis.a087;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A087360 Indices of triangular numbers in A087359.
 * @author Sean A. Irvine
 */
public class A087360 extends Sequence1 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
        return Z.ONE;
      }
      mB = Z.THREE;
      return Z.TWO;
    }
    Z t = mB;
    do {
      t = t.add(mA);
    } while (!Predicates.TRIANGULAR.is(t));
    mA = mB;
    mB = t;
    return Functions.TRINV.z(t);
  }
}
