package irvine.oeis.a073;

import irvine.math.ContinuedFractionUtils;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A073098 a(1)=2, a(n) is the smallest positive integer such that the continued fraction for 1/a(1)+1/a(2)+....+1/a(n) contains strictly more elements than the continued fraction for 1/a(1)+1/a(2)+....+1/a(n-1).
 * @author Sean A. Irvine
 */
public class A073098 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private int mLen = 0;

  @Override
  public Z next() {
    long k = 1;
    while (true) {
      final Q t = mSum.add(new Q(1, ++k));
      final int l = ContinuedFractionUtils.continuedFraction(t).size();
      if (l > mLen) {
        mSum = t;
        mLen = l;
        return Z.valueOf(k);
      }
    }
  }
}
