package irvine.oeis.a019;

import irvine.math.z.Z;
import irvine.oeis.a000.A000670;

/**
 * A019472.
 * @author Sean A. Irvine
 */
public class A019472 extends A000670 {

  @Override
  public Z next() {
    return super.next().subtract(mF.factorial(mN));
  }
}
