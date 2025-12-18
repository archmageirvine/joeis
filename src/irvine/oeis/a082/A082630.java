package irvine.oeis.a082;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082630 Limit of the sequence obtained from S(0) = (1,1) and, for n &gt; 0, S(n) = I(S(n-1)), where I consists of inserting, for i = 1, 2, 3..., the term a(i) + a(i+1) between any two terms for which 7*a(i+1) &lt;= 11*a(i).
 * @author Sean A. Irvine
 */
public class A082630 extends Sequence1 {

  private Z mX = Z.ONE;
  private Z mY = Z.ONE;

  @Override
  public Z next() {
    final Z res = mX;
    while (mX.add(mY).multiply(7).compareTo(mX.multiply(11)) <= 0) {
      mY = mY.add(mX);
    }
    mX = mX.add(mY);
    return res;
  }
}
