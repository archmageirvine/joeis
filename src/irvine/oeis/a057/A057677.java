package irvine.oeis.a057;

import irvine.math.api.RationalSequence;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A057677 a(n) is the numerator of b(n) where b(n)=1/b(n-1)+1/b(n-2) with b(1)=1 and b(2)=2.
 * @author Sean A. Irvine
 */
public class A057677 extends Sequence1 implements RationalSequence {

  private Q mA = null;
  private Q mB = null;

  @Override
  public Q nextQ() {
    if (mB == null) {
      if (mA == null) {
        mA = Q.ONE;
        return Q.ONE;
      }
      mB = Q.TWO;
      return Q.TWO;
    }
    final Q b = mA.reciprocal().add(mB.reciprocal());
    mA = mB;
    mB = b;
    return mB;
  }

  @Override
  public Z next() {
    return nextQ().num();
  }
}
