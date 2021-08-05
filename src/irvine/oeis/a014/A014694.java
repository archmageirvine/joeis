package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.a065.A065091;

/**
 * A014694 a(n) = prime(n+1) - (-1)^n*ceiling(n/2).
 * @author Sean A. Irvine
 */
public class A014694 extends A065091 {

  private long mSign = 0;

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
