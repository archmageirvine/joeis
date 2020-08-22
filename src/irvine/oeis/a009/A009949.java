package irvine.oeis.a009;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A009949 Factorial expansion of sqrt(2) = Sum_{n&gt;=1} a(n)/n!, using greedy algorithm.
 * @author Sean A. Irvine
 */
public class A009949 implements Sequence {

  private int mN = 0;
  private Z mF = Z.ONE;
  private CR mX = CR.SQRT2;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN);
    final Z t = mX.multiply(mF).floor();
    mX = mX.subtract(CR.valueOf(new Q(t, mF)));
    return t;
  }
}
