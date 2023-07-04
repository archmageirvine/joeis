package irvine.oeis.a000;

import java.io.Serializable;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000129 Pell numbers: a(0) = 0, a(1) = 1; for n &gt; 1, a(n) = 2*a(n-1) + a(n-2).
 * @author Sean A. Irvine
 */
public class A000129 extends Sequence0 implements Serializable {

  private Z mA = Z.TWO.negate();
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    final Z r = mB.multiply2().add(mA);
    mA = mB;
    mB = r;
    return r;
  }
}
