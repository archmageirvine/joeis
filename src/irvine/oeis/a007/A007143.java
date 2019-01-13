package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a003.A003238;

/**
 * A007143.
 * @author Sean A. Irvine
 */
public class A007143 extends A007141 {

  private final A003238 mS = new A003238();

  @Override
  public Z next() {
    return Z.ZERO.max(super.next().subtract(mS.next().multiply2()));
  }
}
