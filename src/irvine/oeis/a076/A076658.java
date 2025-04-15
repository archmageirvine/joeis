package irvine.oeis.a076;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A076658 Numerator of f(n), where for n &gt; 2, f(n) = (n-1)/f(n-1) + (n-2)/f(n-2), with f(1)=1, f(2)=2.
 * @author Sean A. Irvine
 */
public class A076658 extends Sequence1 {

  private Q mA = Q.ONE;
  private Q mB = Q.TWO;
  private long mN = 0;

  protected Z select(final Q n) {
    return n.num();
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    } else if (mN > 2) {
      final Q t = mB.reciprocal().multiply(mN - 1).add(mA.reciprocal().multiply(mN - 2));
      mA = mB;
      mB = t;
    }
    return select(mB);
  }
}
