package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076655 a(n) = numberator(b(n)) where b(1)=1, b(2)=2 and for n &gt; 2, b(n) = 1/b(n-2) - 1/b(n-1).
 * @author Sean A. Irvine
 */
public class A076655 extends Sequence1 {

  private Q mA = null;
  private Q mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Q.ONE;
        return Z.ONE;
      }
      mB = Q.TWO;
      return Z.TWO;
    }
    final Q t = mA.reciprocal().subtract(mB.reciprocal());
    mA = mB;
    mB = t;
    return t.num();
  }
}
