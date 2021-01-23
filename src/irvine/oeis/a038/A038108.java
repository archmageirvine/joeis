package irvine.oeis.a038;

import irvine.math.z.Z;
import irvine.oeis.a001.A001358;

/**
 * A038108 Number of prime pairs {p,q}, such that pq &lt; n^2.
 * @author Sean A. Irvine
 */
public class A038108 extends A001358 {

  private long mCount = 0;
  private long mN = 1;
  private Z mS = super.next();

  @Override
  public Z next() {
    final Z square = Z.valueOf(++mN).square();
    while (mS.compareTo(square) < 0) {
      mS = super.next();
      ++mCount;
    }
    return Z.valueOf(mCount);
  }
}
