package irvine.oeis.a007;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007409 Denominators of Sum_{k=1..n} <code>1/k^3</code>.
 * @author Sean A. Irvine
 */
public class A007409 implements Sequence {

  private long mN = 0;
  private Q mSum = Q.ZERO;

  @Override
  public Z next() {
    mSum = mSum.add(new Q(Z.ONE, Z.valueOf(++mN).pow(3)));
    return mSum.den();
  }
}

