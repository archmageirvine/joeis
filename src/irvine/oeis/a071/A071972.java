package irvine.oeis.a071;

import irvine.math.ContinuedFractionUtils;
import irvine.math.function.Functions;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071972 a(1)=1, a(n) is the smallest integer &gt; a(n-1) such that the sum of elements of the simple continued fraction for S(n)=1/a(1)+1/a(2)+...+1/a(n) equals n^4.
 * @author Sean A. Irvine
 */
public class A071972 extends Sequence1 {

  private Q mSum = Q.ZERO;
  private int mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    final Z n4 = Z.valueOf(++mN).pow(4);
    while (true) {
      final Q t = mSum.add(new Q(1, mM));
      if (Functions.SUM.z(ContinuedFractionUtils.continuedFraction(t)).equals(n4)) {
        mSum = t;
        return Z.valueOf(mM);
      }
      ++mM;
    }
  }
}
