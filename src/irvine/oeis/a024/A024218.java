package irvine.oeis.a024;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024218 a(n) = s(1)*s(2)*...*s(n+1)(1/s(2) - 1/s(3) + ... + c/s(n+1)), where c=(-1)^n+1 and s(k) = 3k-2 for k = 1,2,3,...
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

