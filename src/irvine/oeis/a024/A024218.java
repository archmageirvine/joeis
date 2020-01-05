package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024218 <code>a(n) = s(1)*s(2)*...*s(n+1)(1/s(2) - 1/s(3) + ... + c/s(n+1))</code>, where <code>c=(-1)^n+1</code> and <code>s(k) = 3k-2</code> for k <code>= 1,2,3,..</code>.
 * @author Sean A. Irvine
 */
public class A024218 implements Sequence {

  private long mN = 1;
  private Z mP = Z.ONE;
  private Q mS = Q.ZERO;

  @Override
  public Z next() {
    mN += 3;
    mP = mP.multiply(mN);
    mS = mS.signedAdd((mN & 1) == 0, new Q(1, mN));
    return mS.multiply(mP).toZ();
  }
}

