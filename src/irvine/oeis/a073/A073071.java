package irvine.oeis.a073;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A073071 Least k such that k! &gt; prime(1)*prime(2)*...*prime(n) where prime(n) is the n-th prime.
 * @author Sean A. Irvine
 */
public class A073071 extends Sequence1 {

  private final Sequence mPrimorial = new A002110().skip();
  private long mN = 1;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    final Z p = mPrimorial.next();
    while (mF.compareTo(p) <= 0) {
      mF = mF.multiply(++mN);
    }
    return Z.valueOf(mN);
  }
}
