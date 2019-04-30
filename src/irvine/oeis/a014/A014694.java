package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A014694 <code>a(n) = ithprime(n+1) - (-1)^n*ceiling(n/2)</code>.
 * @author Sean A. Irvine
 */
public class A014694 extends A000040 {

  private long mSign = 0;
  {
    super.next();
  }

  @Override
  public Z next() {
    if (mSign <= 0) {
      mSign = 1 - mSign;
    } else {
      mSign = -mSign;
    }
    return super.next().add(mSign);
  }
}
