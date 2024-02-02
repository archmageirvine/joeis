package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.oeis.a067.A067734;

/**
 * A068185 Number of ways writing n^n as a product of decimal digits of some other number which has no digits equal to 1.
 * @author Sean A. Irvine
 */
public class A068185 extends A067734 {

  private long mN = 0;

  @Override
  public Z next() {
    return a(Z.valueOf(++mN).pow(mN));
  }
}
