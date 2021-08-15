package irvine.oeis.a121;
// manually 2021-08-15

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A121343 a(n) = Fibonacci(n) mod n(n+1)/2.
 * @author Georg Fischer
 */
public class A121343 extends A000045 {

  private Z mN = Z.NEG_ONE;

  {
    super.next();
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    return mN.equals(Z.ZERO) ? Z.ZERO : super.next().mod(mN.multiply(mN.add(1)).divide2());
  }
}
