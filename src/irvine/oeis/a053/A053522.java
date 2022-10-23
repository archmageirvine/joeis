package irvine.oeis.a053;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053522 a(n)=[A*a(n-1)+B*a(n-2)+C]/p^r, where p^r is the highest power of p dividing [A*a(n-1)+B*a(n-2)+C], A=1.0001, B=1.0001, C=1.5, p=2.
 * @author Sean A. Irvine
 */
public class A053522 extends Sequence1 {

  private static final Q A = new Q(10001, 10000);
  private static final Q C = new Q(3, 2);

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      if (mA == null) {
        mA = Z.ONE;
      } else {
        mB = Z.ONE;
      }
      return Z.ONE;
    }
    final Z t = A.multiply(mA.add(mB)).add(C).floor().makeOdd();
    mA = mB;
    mB = t;
    return mB;
  }
}
