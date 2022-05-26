package irvine.oeis.a057;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A057209 n!^n *sum_{k=1 to n}[1/k^k].
 * @author Sean A. Irvine
 */
public class A057209 implements Sequence {

  private Z mF = Z.ONE;
  private Q mSum = Q.ZERO;
  private long mN = 0;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    final Z t = mF.pow(mN);
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(mN).pow(mN)));
    return mSum.multiply(t).toZ();
  }
}
