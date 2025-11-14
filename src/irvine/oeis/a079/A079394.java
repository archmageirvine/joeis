package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.a000.A000594;

/**
 * A079394 Compare t(n) and t(n+1) where t = Ramanujan's tau function (A000594); a(n) = p concatenated with q where p and q are given below.
 * @author Sean A. Irvine
 */
public class A079394 extends A000594 {

  private Z mT = super.next();

  @Override
  public Z next() {
    final Z s = mT;
    mT = super.next();
    final long p = s.signum() < 0 ? (mT.signum() < 0 ? 1 : 3) : (mT.signum() < 0 ? 2 : 4);
    final long q = s.compareAbs(mT) <= 0 ? 1 : 2;
    return Z.valueOf(p * 10 + q);
  }
}
