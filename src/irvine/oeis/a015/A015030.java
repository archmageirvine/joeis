package irvine.oeis.a015;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A015030.
 * @author Sean A. Irvine
 */
public class A015030 implements Sequence {

  private long mN = -1;
  private Z mT = Z.ONE;

  protected long q() {
    return 2;
  }

  @Override
  public Z next() {
    ++mN;
    Z t2 = mT.square();
    mT = mT.multiply(q());
    Q res = new Q(Z.valueOf(1 - q()), Z.ONE.subtract(mT));
    Z qk = Z.ONE;
    for (long k = 0; k < mN; ++k) {
      qk = qk.multiply(q());
      res = res.multiply(new Q(Z.ONE.subtract(t2), Z.ONE.subtract(qk)));
      t2 = t2.divide(q());
    }
    return res.toZ();
  }
}
