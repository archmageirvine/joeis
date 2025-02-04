package irvine.oeis.a074;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073524.
 * @author Sean A. Irvine
 */
public class A074935 extends Sequence1 {

  private Q mA = null;
  private Q mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Q.ONE;
      } else {
        mB = Q.TWO;
      }
      return Z.ONE;
    }
    final Q t = mA.reciprocal().subtract(mB.reciprocal());
    mA = mB;
    mB = t;
    return t.den();
  }
}
