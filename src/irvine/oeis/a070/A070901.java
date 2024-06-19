package irvine.oeis.a070;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070901 a(1)=1, a(n) is the smallest integer &gt; a(n-1) such that the largest element in the simple continued fraction for S(n)=1/a(1)+1/a(2)+...+1/a(n) equals prime(n).
 * @author Sean A. Irvine
 */
public class A070901 extends A000040 {

  private Q mSum = null;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    final Z p = super.next();
    if (mSum == null) {
      mSum = Q.ONE;
      return Z.ONE;
    }
    while (true) {
      final Q t = mSum.add(new Q(Z.ONE, mM));
      final Z max = Functions.MAX.z(ContinuedFractionUtils.continuedFraction(t));
      if (max.equals(p)) {
        mSum = t;
        return mM;
      }
      mM = mM.add(1);
    }
  }
}
