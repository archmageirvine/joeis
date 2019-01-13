package irvine.oeis.a007;

import irvine.math.z.Z;
import irvine.oeis.a294.A294724;
import irvine.oeis.a294.A294728;

/**
 * A007170.
 * @author Sean A. Irvine
 */
public class A007170 extends A007169 {

  private final A294724 mV = new A294724();
  private final A294728 mW = new A294728();

  @Override
  public Z next() {
    return mV.next().subtract(mW.next()).divide2().add(super.next());
  }
}
