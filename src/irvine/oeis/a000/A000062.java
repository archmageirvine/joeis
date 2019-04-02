package irvine.oeis.a000;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000062 A Beatty sequence: a(n) = floor(n/(e-2)).
 * @author Sean A. Irvine
 */
public class A000062 implements Sequence {

  private Q mE = Q.HALF;
  private Z mF = Z.TWO;
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    mF = mF.multiply(mN + 2);
    mE = mE.add(new Q(Z.ONE, mF));
    return new Q(mN).divide(mE).toZ();
  }
}

