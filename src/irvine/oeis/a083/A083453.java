package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.a000.A000422;

/**
 * A083453 a(n) = (concatenation of numbers from n to 1) - n^n.
 * @author Sean A. Irvine
 */
public class A083453 extends A000422 {

  private long mN = 0;

  @Override
  public Z next() {
    return super.next().subtract(Z.valueOf(++mN).pow(mN));
  }
}
