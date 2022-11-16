package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000045;

/**
 * A005922 a(1)=1; a(n) = n!*Fibonacci(n+2), n &gt; 1.
 * @author Sean A. Irvine
 */
public class A005922 extends A000045 {

  private Z mF = null;
  private long mN = 1;

  {
    setOffset(1);
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    if (mF == null) {
      mF = Z.ONE;
      return Z.ONE;
    } else {
      mF = mF.multiply(++mN);
    }
    return mF.multiply(super.next());
  }
}

