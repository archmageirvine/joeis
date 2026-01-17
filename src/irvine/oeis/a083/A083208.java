package irvine.oeis.a083;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A083208 a(n) = A083206(A083207(n)).
 * @author Sean A. Irvine
 */
public class A083208 extends A083206 {

  private final Sequence mA = new A083207();

  @Override
  public Z next() {
    final Z n = mA.next();
    final Z sigma = Functions.SIGMA1.z(n);
    if (sigma.isOdd()) {
      return Z.ZERO;
    }
    return mB.get(n.intValueExact(), sigma.divide2().intValueExact(), 2);
  }
}
