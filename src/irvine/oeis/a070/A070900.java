package irvine.oeis.a070;

import java.util.List;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A070900 a(0)=1, a(n) is the smallest integer &gt;= a(n-1) such that the largest element in the simple continued fraction for S(n)=1/a(0)+1/a(1)+1/a(2)+...+1/a(n) equals the number of elements in this continued fraction.
 * @author Sean A. Irvine
 */
public class A070900 extends Sequence0 {

  private Q mSum = null;
  private Z mM = Z.ONE;

  @Override
  public Z next() {
    if (mSum == null) {
      mSum = Q.ONE;
      return Z.ONE;
    }
    while (true) {
      final Q t = mSum.add(new Q(Z.ONE, mM));
      final List<Z> cf = ContinuedFractionUtils.continuedFraction(t);
      final Z max = Functions.MAX.z(cf);
      if (max.equals(cf.size())) {
        mSum = t;
        return mM;
      }
      mM = mM.add(1);
    }
  }
}
