package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.a000.A000055;
import irvine.oeis.a001.A001429;

/**
 * A005703.
 * @author Sean A. Irvine
 */
public class A005703 extends A000055 {

  private final A001429 mB = new A001429();
  private long mN = 0;

  @Override
  public Z next() {
    return super.next().add(++mN <= 3 ? Z.ZERO : mB.next());
  }
}
