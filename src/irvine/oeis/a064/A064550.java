package irvine.oeis.a064;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a005.A005185;

/**
 * A064550 a(1) = 2, a(n)=a(n-1)+2*Q(n)-n, n &gt; 1 where Q = A005185.
 * @author Sean A. Irvine
 */
public class A064550 extends Sequence0 {

  private final Sequence mQ = new A005185().skip(2);
  private Z mA = null;
  private long mN = 0;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else if (++mN == 1) {
      mA = Z.TWO;
    } else {
      mA = mA.add(mQ.next().multiply(2).subtract(mN));
    }
    return mA;
  }
}

