package irvine.oeis.a036;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036982 a(n)=[ a*a(n-1)+b ]/p^r, where a=2.001, b=3.2, p=2 and p^r is the highest power of p dividing [ a*a(n-1)+b ].
 * @author Sean A. Irvine
 */
public class A036982 extends Sequence0 {

  private static final Q C1 = new Q(2001, 1000);
  private static final Q C2 = new Q(32, 10);
  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : C1.multiply(mA).add(C2).floor().makeOdd();
    return mA;
  }
}

