package irvine.oeis.a060;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a001.A001511;
import irvine.oeis.a055.A055662;

/**
 * A060589.
 * @author Sean A. Irvine
 */
public class A060571 extends A055662 {

  private final Sequence mA = new A001511();
  {
    setOffset(1);
  }

  @Override
  public Z next() {
    Z t = super.next();
    final int d = mA.next().intValueExact();
    for (int k = 1; k < d; ++k) {
      t = t.divide(10);
    }
    return t.mod(Z.TEN);
  }
}
