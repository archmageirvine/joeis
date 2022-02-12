package irvine.oeis.a166;

import irvine.math.z.Z;
import irvine.oeis.a000.A000217;

/**
 * A166474 a(1)=1; a(2)=2; for n&gt;2, a(n)=a(n-1)+A000217(n-1)*a(n-2).
 * @author Sean A. Irvine
 */
public class A166474 extends A000217 {

  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    final Z t = super.next();
    if (mA == null) {
      mA = Z.ONE;
      return Z.ONE;
    } else if (mB == null) {
      mB = Z.TWO;
    } else {
      final Z r = mB.add(t.multiply(mA));
      mA = mB;
      mB = r;
    }
    return mB;
  }
}
