package irvine.oeis.a054;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a049.A049287;
import irvine.oeis.a049.A049289;

/**
 * A054929 Number of complementary pairs of circulant graphs on n nodes.
 * @author Sean A. Irvine
 */
public class A054929 extends A049287 {

  private final Sequence mA = new A049289();
  private long mN = 0;

  @Override
  public Z next() {
    return ((++mN & 3) == 1 ? super.next().add(mA.next()) : super.next()).divide2();
  }
}
