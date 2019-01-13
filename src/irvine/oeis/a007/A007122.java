package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a005.A005043;
import irvine.oeis.a005.A005213;

/**
 * A007122.
 * @author Sean A. Irvine
 */
public class A007122 extends A005043 {

  private final A005213 mA = new A005213();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    return super.next().subtract(mA.next()).divide2();
  }
}
