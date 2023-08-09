package irvine.oeis.a145;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A145103 a(0) = a(1) = 1. a(n+1) = ceiling(n*a(n)/a(n-1)), for n &gt;= 1.
 * @author Georg Fischer
 */
public class A145103 extends Sequence0 {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    ++mN;
    if (mN <= 1) {
      return mB;
    }
    final Z result = new Q(mB.multiply(mN - 1), mA).ceiling();
    mA = mB;
    mB = result;
    return result;
  }
}
